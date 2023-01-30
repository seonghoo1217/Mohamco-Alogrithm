package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;
// 1h 24m 52s
public class _3190 {
    private static int N, D = 0;
    private static int[][] map;
    private static Map<Integer, String> moveInfo;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));
        StringTokenizer st = null;

        N = Integer.parseInt(input.readLine());
        int K = Integer.parseInt(input.readLine());
        map = new int[N][N];
        moveInfo = new HashMap<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(input.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            map[a][b] = 1;
        }

        int l = Integer.parseInt(input.readLine());
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(input.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            moveInfo.put(time, direction);
        }
        solve();
    }

    private static void solve() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int time = 0;
        int px = 0;
        int py = 0;

        while (true) {
            int nx = px + dx[D];
            int ny = py + dy[D];
            time++;

            // 벽 부딪힘
            if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) {
                break;
            }

            // 몸통 부딪힘
            if (queue.contains(ny * N + nx)) break;

            // 안부딪히면 이동 시작
            if (map[ny][nx] == 1) {
                map[ny][nx] = 0;
                queue.add(ny * N + nx);
            }
            else {
                queue.add(ny * N + nx);
                queue.poll();
            }

            // 방향 전환
            if (moveInfo.containsKey(time)) {
                String data = moveInfo.get(time);
                if (data.equals("D")) {
                    D += 1;
                    if (D == 4) D = 0;
                }
                else {
                    D -= 1;
                    if (D == -1) D = 3;
                }
            }
            px = nx;
            py = ny;
        }
        System.out.println(time);
    }
    private static String src = "10\n" +
            "4\n" +
            "1 2\n" +
            "1 3\n" +
            "1 4\n" +
            "1 5\n" +
            "4\n" +
            "8 D\n" +
            "10 D\n" +
            "11 D\n" +
            "13 L";
}
