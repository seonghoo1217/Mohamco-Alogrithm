package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _17286 {
	//2H14m09s

	public static List<Point> points=new ArrayList<>();
	public static int[] array=new int[4];
	public static boolean[] visited = new boolean[4];
	public static double minimum = Long.MAX_VALUE;

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
	    for (int i=0;i<4;i++){
	    	st=new StringTokenizer(br.readLine());
			points.add(new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		array[0] = 0;
		recur(1);
		System.out.println((int)minimum);
	}

	public static double getDistance(Point x1, Point x2) {
		return Math.sqrt((x1.x - x2.x) * (x1.x - x2.x) + (x1.y - x2.y) * (x1.y - x2.y));
	}

	public static void recur(int cur) {
		if (cur == 4) {
			double sum = 0;
			for (int i = 0; i<3; i++) {
				sum += getDistance(points.get(array[i]), points.get(array[i+1]));
			}

			minimum = Math.min(minimum, sum);
		}

		for (int i = 1; i < 4; i++) {
			if (visited[i]) {
				continue;
			}

			array[cur] = i;
			visited[i] = true;
			recur(cur+1);
			visited[i] = false;
		}
	}

	static class Point{
		public int x;
		public int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
