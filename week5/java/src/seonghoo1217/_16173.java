package seonghoo1217;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16173 {
	//49m51s03

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int [][] game_map=new int[N][N];
		boolean [][] visited=new boolean[N][N];


		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			for (int j=0;j<N;j++){
				game_map[i][j]=Integer.parseInt(st.nextToken());
				visited[i][j]=false;
			}
		}
		bfs(game_map,visited);
	}

	private static void bfs(int[][] game_map, boolean[][] visited) {
		int length = game_map.length;
		boolean success=false;
		Queue<int[]> queue=new LinkedList<>();
		queue.add(new int[] {0,0});

		while (!queue.isEmpty()){
			int[] target = queue.poll();
			int r=target[0];
			int c=target[1];
			visited[r][c]=true;

			if (game_map[r][c]==-1){
				success=true;
				break;
			}

			int bottom=r+game_map[r][c];
			int right=c+game_map[r][c];

			if (bottom<length&&!visited[bottom][c]){
				queue.add(new int[]{r+game_map[r][c],c});
				visited[bottom][c]=true;
			}

			if (right<length&&!visited[r][right]){
				queue.add(new int[]{r,c+game_map[r][c]});
				visited[r][right]=true;
			}
		}

		if (success) System.out.println("HaruHaru");
		else System.out.println("Hing");
	}

}
