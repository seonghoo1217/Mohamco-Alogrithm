package Gawq;

import java.io.*;
import java.util.*;
// 18:37:51
public class _1813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[51];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = N; i >= 0; i--) {
            if (arr[i] == i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}