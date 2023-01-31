package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
//21:37:58
public class _25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        HashSet<String> set = new HashSet<>();

        while(N-- > 0) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                cnt += set.size();
                set.clear();
                continue;
            }
            set.add(s);
        }
        System.out.println(cnt + set.size());
    }
}
