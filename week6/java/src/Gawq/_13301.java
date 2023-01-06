package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//09m53s
public class _13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] tiles = new int[N];
        if (N == 1) {
            System.out.println(4);
        } else if (N == 2) {
            System.out.println(6);
        } else {
            tiles[0] = 1;
            tiles[1] = 1;

            for (int i = 2; i < N; i++) {
                tiles[i] = tiles[i - 1] + tiles[i - 2];
            }

            System.out.println((tiles[N - 1] * 2) + (tiles[N - 1] + tiles[N - 2]) * 2);
        }
    }
}
