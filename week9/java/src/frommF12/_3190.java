package problems.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1시간 이상
public class _3190 {

    static int[][] map;
    static Map<Integer, String> directionMap = new HashMap<>();
    static List<int[]> snake = new LinkedList<>();
    static int N, K, L;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            map[x][y] = 1;
        }

        L = Integer.parseInt(br.readLine());
        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            directionMap.put(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        int time = 0;
        int px = 0;
        int py = 0;
        int direction = 0;
        snake.add(new int[]{0,0});
        while (true) {
            time++;

            px += dx[direction];
            py += dy[direction];

            if (gameOver(px, py)) {
                break;
            }

            if (map[px][py] == 1) {
                map[px][py] = 0;
                snake.add(new int[] {px, py});
            } else {
                snake.add(new int[] {px, py});
                snake.remove(0);
            }

            if (directionMap.containsKey(time)) {
                if (directionMap.get(time).equals("D")) {
                    direction++;
                    if (direction == 4) {
                        direction = 0;
                    }
                } else {
                    direction--;
                    if (direction == -1) {
                        direction = 3;
                    }
                }
            }
        }
        System.out.println(time);
    }

    public static boolean gameOver(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return true;
        }

        for (int i = 0; i < snake.size(); i++) {
            int[] snakeBody = snake.get(i);
            if (snakeBody[0] == x && snakeBody[1] == y) {
                return true;
            }
        }
        return false;
    }
}

