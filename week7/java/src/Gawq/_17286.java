package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;
//32m20s
public class _17286 {
    private static double a, b, c, d;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));
        int[][] loc = new int[4][2];
        StringTokenizer st = null;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(input.readLine());
            for (int j = 0; j < 2; j++) {
                loc[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        double distance = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                a = loc[i][j];
                b = loc[i][j + 1];
                c = loc[i + 1][j];
                d = loc[i + 1][j + 1];
            }
            distance += Math.sqrt(Math.pow(Math.abs(a - c),2) + Math.pow(Math.abs(b - d),2));
        }
        System.out.println((int) distance);
    }

    private static String src = "2 1\n" +
            "-1 0\n" +
            "2 3\n" +
            "-2 1";
}
