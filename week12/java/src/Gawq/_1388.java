package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class _1388 {
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));
        StringTokenizer st = new StringTokenizer(input.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = input.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = row.charAt(j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == '|') {
                    tmp = 0;
                } else if (++tmp == 1) {
                    cnt++;
                }
            }
        }
        for (int j = 0; j < M; j++) {
            int tmp = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == '-') {
                    tmp = 0;
                } else if (++tmp == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    static String src = "6 9\n" +
            "-||--||--\n" +
            "--||--||-\n" +
            "|--||--||\n" +
            "||--||--|\n" +
            "-||--||--\n" +
            "--||--||-";
}
