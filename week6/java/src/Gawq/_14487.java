package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 13m47s
public class _14487 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] charge = new int[n];
        for (int i = 0; i < n; i++) {
            charge[i] = Integer.parseInt(st.nextToken());
        }
        int [] sum = new int[n];
        int min_sum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum[i] += charge[j];
                }
            }
        }
        min_sum = sum[0];
        for (int i = 1; i < n; i++) {
            if (min_sum > sum[i]) {
                min_sum = sum[i];
            }
        }

        System.out.println(min_sum);
    }
}
