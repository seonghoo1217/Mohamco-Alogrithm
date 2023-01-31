import java.util.Arrays;
import java.util.Scanner;
// 21:24:05
public class _2750 {
    public static void main(String args[]) {
        int n;
        int[] numbers;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        numbers = new int [n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sort(numbers);
        for (int j = 0; j < n; j++) {
            System.out.println(numbers[j]);
        }
    }

    private static int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
