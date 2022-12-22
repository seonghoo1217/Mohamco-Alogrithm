package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
// 46m32s11
public class _2210 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static HashSet<String> list;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = 5;

        list = new HashSet<>();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        String s = new String();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                DFS(i, j, 0, s);
            }
        }
        System.out.println(list.size());
    }

    public static void DFS(int x, int y, int depth, String s) {
        // 길이가 6일 때 set에 넣고 종료
        if(depth == 6) {
            list.add(s);
            return;
        }

        // 상하좌우 이동할 수 있다. 왔던 길도 다시 올 수 있다.
        for (int i = 0; i < 4; i++) {
            int nextX = dx[i] + x;
            int nextY = dy[i] + y;

            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
                continue;
            }
            DFS(nextX, nextY, depth + 1, s+arr[x][y]);
        }
    }
}
