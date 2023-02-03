package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 46m23s
public class _11650 {
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));

        N = Integer.parseInt(input.readLine());
        int[][] arr = new int[N][2];

        StringTokenizer st = null;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(input.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) return e1[1] - e2[1];
            else return e1[0] - e2[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }

        System.out.println(sb);

    }


    private static String src = "5\n" +
            "3 4\n" +
            "1 1\n" +
            "1 -1\n" +
            "2 2\n" +
            "2 3";
}
