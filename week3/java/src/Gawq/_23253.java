package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
// 35:14:06
public class _23253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = br.readLine().split(" ");

        int dummies = Integer.parseInt(s1[1]);

        boolean result = true;

        for (int i = 0; i < dummies; i++) {
            int c = Integer.parseInt(br.readLine());
            String[] s2 = br.readLine().split(" ");
            int preVal = 200_001;
            for (int j = 0; j < c; j++) {
                if (Integer.parseInt(s2[j]) > preVal) {
                    result = false;
                    break;
                }
                preVal = Integer.parseInt(s2[j]);
            }
        }
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}