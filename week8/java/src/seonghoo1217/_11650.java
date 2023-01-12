package seonghoo1217;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {
	//04m31s22
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] xy=new int[N][2];
		StringTokenizer st;
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			xy[i][0]=Integer.parseInt(st.nextToken());
			xy[i][1]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(xy,(x1,x2)->{
			if (x1[0]==x2[0]){
				return x1[1]-x2[1];
			}else {
				return x1[0]-x2[0];
			}
		});
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<N;i++){
			sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
		}

		System.out.println(sb);
	}
}
