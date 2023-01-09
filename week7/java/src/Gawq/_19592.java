package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 1h32m56s
public class _19592 {
    private static int N, X, Y, MAX_SPEED, V, Z;
    private static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            MAX_SPEED = Integer.MIN_VALUE;
            for (int j = 0; j < N - 1; j++) {
                V = Integer.parseInt(st.nextToken());
                MAX_SPEED = Math.max(MAX_SPEED, V);
            }
            // 나의 속도
            V = Integer.parseInt(st.nextToken());
            // 경쟁자의 도달 시간
            double competitor = 1.0 * X / MAX_SPEED;
            // 부스트를 안쓰고도 이기면
            if (V > MAX_SPEED) {
                Z = 0;
            }
            // 부스트를 최대한 써도 안되면
            else if (1 + 1.0 * (X - Y) / V >= competitor) {
                Z = -1;
            }
            // 나머지 경우
            else {
                int left = 0;
                int right = Y;
                int mid = 0;
                while (left <= right) {
                    mid = (left + right) / 2;
                    double mt = 1 + 1.0 * (X - mid) / V;
                    if (mt >= competitor) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
                Z = left;
            }
            sb.append(Z).append("\n");
        }
        System.out.println(sb);
    }
}
