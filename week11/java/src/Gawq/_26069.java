package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(src));
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        String key = "ChongChong";
        map.put(key, count);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if (!map.containsKey(A) && !map.containsKey(B)) {
                continue;
            }
            else {
                if (map.containsKey(A)) {
                    map.put(A, count++);
                    map.put(B, count);
                } else if (map.containsKey(B)) {
                    map.put(B, count++);
                    map.put(A, count);
                }
            }
        }
        System.out.println(map.size());
    }
    static String src = "12\n" +
            "bnb2011 chansol\n" +
            "chansol chogahui05\n" +
            "chogahui05 jthis\n" +
            "jthis ChongChong\n" +
            "jthis jyheo98\n" +
            "jyheo98 lms0806\n" +
            "lms0806 pichulia\n" +
            "pichulia pjshwa\n" +
            "pjshwa r4pidstart\n" +
            "r4pidstart swoon\n" +
            "swoon tony9402\n" +
            "tony9402 bnb2011";
}
