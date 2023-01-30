package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 36m42s
public class _2980 {
    private static int N, L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int curPos = 0, time = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            time += arr[0] - curPos;
            curPos = arr[0];

            int section = time % (arr[1] + arr[2]);
            if (section < arr[1]) {
                time += arr[1] - section;
            }
        }
        System.out.println(time + L - curPos);
    }
}
