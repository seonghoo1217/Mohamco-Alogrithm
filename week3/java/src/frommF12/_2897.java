import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 52:37
public class _2897 {

    private static char[][] map;
    private static int[] result = new int[5];
    static int car;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new char[R][C];

        for(int i = 0; i < R; i++){
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R - 1; i++) {
            for (int j = 0; j < C - 1; j++) {
                if (map[i][j] == '#' || map[i][j + 1] == '#' || map[i + 1][j] == '#' || map[i + 1][j + 1] == '#') {
                    continue;
                }
                if (map[i][j] == 'X') {
                    car++;
                }
                if (map[i][j+1] == 'X') {
                    car++;
                }
                if (map[i+1][j] == 'X') {
                    car++;
                }
                if (map[i+1][j+1] == 'X') {
                    car++;
                }
                result[car]++;
                car = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

