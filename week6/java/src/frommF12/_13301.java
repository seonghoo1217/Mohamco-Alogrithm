package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 42:35
public class _13301 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) + 1;
        long [] fibonacci = new long[N];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        long result = fibonacci[N - 1] * 2 + (fibonacci[N - 1] + fibonacci[N - 2]) * 2;
        System.out.println(result);
    }
}

