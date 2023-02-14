package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class _2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(src));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            arr[i] = map.get(input);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    answer++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
    static String src = "5\n" +
            "ZG508OK\n" +
            "PU305A\n" +
            "RI604B\n" +
            "ZG206A\n" +
            "ZG232ZF\n" +
            "PU305A\n" +
            "ZG232ZF\n" +
            "ZG206A\n" +
            "ZG508OK\n" +
            "RI604B";
}
