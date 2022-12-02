import java.util.Scanner;
// 2:20:23
public class _9358 {
    public static void main(String args[]) {
        int cases;
        int n;
        int[] numbers;
        String[] result;
        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();
        result = new String[cases];
        for (int i = 1; i <= cases; i++){
            n = sc.nextInt();
            numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = sc.nextInt();
            }
            result[i-1] = games(numbers, n, i);
        }
        for (int i = 0; i < cases; i++)
            System.out.println(result[i]);
    }
    private static String games(int[] numbers, int n, int cases) {
        int[] answer = {};
        int half, j;
        String result;
        int b = 0;
        if (n == 2) {
            if (numbers[b] > numbers[b + 1]) {
                result = "Case #" + cases+ " : Alice";
            } else
                result = "Case #" + cases + " : Bob";
            return result;
        }
        else {
            while (n > 2) {
                answer = new int[n];
                half = n / 2;
                j = n - 1;
                if (n % 2 == 0) {
                    for (int i = 0; i < half; i++) {
                        answer[i] = numbers[i] + numbers[j];
                        j--;
                    }
                    n = n / 2;
                } else {
                    for (int i = 0; i < half; i++) {
                        answer[i] = numbers[i] + numbers[j];
                        j--;
                    }
                    answer[half] = numbers[half] * 2;
                    n = n / 2 + 1;
                }
            }
            if (answer[b] > answer[b + 1]) {
                result = "Case #" + cases+ " : Alice";
            } else
                result = "Case #" + cases + " : Bob";
            return result;
        }
    }
}
