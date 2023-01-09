package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 53m41s
public class _2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int left = 0, right = -1;
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, nums[i]);
        }
        int maximum = Integer.parseInt(br.readLine());
        while (left <= right) {
            int mid = (left + right) / 2;
            long budget = 0;
            for (int i = 0; i < N; i++) {
                if (nums[i] > mid) budget += mid;
                else budget += nums[i];
            }
            if (budget <= maximum) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }


}
