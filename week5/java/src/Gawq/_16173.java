package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 51m27s33
public class _16173 {
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    static int[][] arr;
    static boolean visited[][];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        search(0, 0);

        System.out.println("Hing");
    }
    public static void search(int x, int y) {
        if (arr[x][y] == -1) {
            System.out.println("HaruHaru");
            System.exit(0);
        }
        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i] * arr[x][y];
            int ny = y + dy[i] * arr[x][y];

            if (nx >= N || ny >= N || visited[nx][ny]) continue;

            visited[nx][ny] = true;
            search(nx, ny);
        }
    }
}

