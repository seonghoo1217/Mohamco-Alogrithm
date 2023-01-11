import java.util.Scanner;

public class _19592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            double min = x;
            for (int i = 0; i < n - 1; i++) {
                int v = sc.nextInt();
                min = Math.min(min, 1.0 * x / v);
            }

            int v = sc.nextInt();

            if (min > 1.0 * x / v) {
                System.out.println(0);
                continue;
            }

            int left = 0;
            int right = y;

            while (left <= right) {
                int mid = (left + right) / 2;
                double booster = 1 + 1.0 * (x - mid) / v;
                if (booster >= min) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left > y) {
                System.out.println(-1);
            } else {
                System.out.println(left);
            }
        }
    }
}

