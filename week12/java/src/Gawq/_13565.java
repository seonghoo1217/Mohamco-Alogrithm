package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class _13565 {
    static int col, row;
    static int[][] map;
    static boolean[][] visited;
    static boolean flag = false;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(src));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        map = new int[col][row];

        for (int i = 0; i < col; i++) {
            String temp = br.readLine();
            for (int j = 0; j < row; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < row; i++) {
            if (flag) break;
            if (map[0][i] == 0) {
                visited = new boolean[col][row];
                visited[0][i] = true;
                dfs(0, i);
            }
        }
        if (flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static void dfs(int x, int y) {
        if (x == (col - 1)) {
            flag = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if (xx < 0|| yy < 0 || xx >= col || yy >= row) continue;
            if (map[xx][yy] == 0 && !visited[xx][yy]) {
                visited[xx][yy] = true;
                dfs(xx, yy);
            }
        }
    }
    static String src = "5 6\n" +
            "010101\n" +
            "010000\n" +
            "011101\n" +
            "100011\n" +
            "001011";
}
