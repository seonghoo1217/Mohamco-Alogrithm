package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
//23:44:42
public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                set.add(name);
            }
            else {
                set.remove(name);
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (var arr : list) {
            System.out.println(arr);
        }
    }
}
