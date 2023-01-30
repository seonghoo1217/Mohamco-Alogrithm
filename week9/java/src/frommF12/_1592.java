package problems.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 44:56
public class _1592 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int count = 0;
        int index = 0;

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        array[0] = 1;

        while (true) {
            if (array[index] == M) {
                System.out.println(count);
                return;
            }

            if (index + 1 % 2 == 0) {
                if (index + L > array.length - 1) {
                    index = index + L - array.length;
                    array[index]++;
                    count++;
                    continue;
                }
                index += L;
            } else {
                if (index - L < 0) {
                    index = index + array.length - L;
                    array[index]++;
                    count++;
                    continue;
                }
                index -= L;
            }
            count++;
            array[index]++;
        }
    }
}

