package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2606 {
    static boolean[] check;
    static int[][] arr;
    static int count = 0;

    static int node, line;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(src));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        check[start] = true;
        count++;

        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
    static String src = "7\n" +
            "6\n" +
            "1 2\n" +
            "2 3\n" +
            "1 5\n" +
            "5 2\n" +
            "5 6\n" +
            "4 7";
}
