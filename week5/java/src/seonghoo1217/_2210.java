package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2210 {
	//38m56s09

	static List<String> list=new ArrayList<>();
	static int[] dx={-1,1,0,0};
	static int[] dy={0,0,-1,1};

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String[][] map = new String[5][5];

		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				map[i][j] = st.nextToken();
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				dfs(map, i, j, 0, map[i][j]);
			}
		}
		System.out.println(list.size());
	}

	private static void dfs(String[][] map, int x, int y, int cnt, String LocationOfMap) {
		if (cnt==5){
			if (!list.contains(LocationOfMap)){
				list.add(LocationOfMap);
			}
			return;
		}
		for (int i=0;i<4;i++){
			int nowx = x+dx[i];
			int nowy = y+dy[i];
			if((0<=nowx&&nowx<5)&&(0<=nowy&&nowy<5)) {
				dfs(map, nowx, nowy, cnt+1, LocationOfMap+map[nowx][nowy]);
			}
		}
	}
}
