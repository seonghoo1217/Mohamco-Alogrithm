package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
// 41m13s
public class _2960 {
    private static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(solve(N, K));
    }

    private static int solve(int n, int k) {
        int cnt = 0;
        boolean[] visit = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (!visit[j]) {
                    cnt++;
                    visit[j] = true;
                }
                if (cnt == k) return j;
            }
        }
        return -1;
    }
}
