package seonghoo1217;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _3190 {

	//1h38m54s29

	private static int[] dx = {0, 1, 0, -1};
	private static int[] dy = {1, 0, -1, 0};
	private static int n, l, k;
	private static int[][] board;
	private static List<int[]> snake;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		StringTokenizer st;

		snake = new LinkedList<>();
		snake.add(new int[]{0, 0});
		board=new int[N][N];
		for (int i = 0; i < k; i++) {
			st=new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			board[x - 1][y - 1] = 1;
		}
		int L = Integer.parseInt(br.readLine());
		int[][] dir = new int[l][2];
		for (int i = 0; i < l; i++) {
			st=new StringTokenizer(br.readLine());
			dir[i][0] = Integer.parseInt(st.nextToken());
			char temp = st.nextToken().charAt(0);
			dir[i][1] = (temp == 'L') ? -1 : 1;
		}
		int time = solution(0, 0, 0, dir);
		System.out.println(time);
	}

	private static int solution(int curX, int curY, int currentDir, int[][] dir) {
		int time = 0;
		int turn = 0;

		while (true) {
			time++;
			int nextX = curX + dx[currentDir];
			int nextY = curY + dy[currentDir];

			if (isFinish(nextX, nextY)) break;

			if (board[nextX][nextY] == 2) {
				snake.add(new int[]{nextX, nextY});
			} else {
				snake.add(new int[]{nextX, nextY});
				snake.remove(0);
			}

			curX = nextX;
			curY = nextY;

			if (turn < l) {
				if (time == dir[turn][0]) {
					currentDir = nextDir(currentDir, dir[turn][1]);
					turn++;
				}
			}
		}
		return time;
	}

	private static int nextDir(int current, int dir) { // current 현재, dir 다음 방향
		int next = (current + dir) % 4;
		if (next == -1) next = 3;

		return next;
	}

	private static boolean isFinish(int x, int y) {
		if (x == -1 || x == n || y == -1 || y == n) { // 다음 위치가 보드판 밖으로 나갔는지
			return true;
		}
		for (int i = 0; i < snake.size(); i++) {
			int[] s = snake.get(i);
			if (s[0] == x && s[1] == y) return true;
		}
		return false;
	}

}
