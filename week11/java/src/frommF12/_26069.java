package problems.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _26069 {

    static final String chongChong = "ChongChong";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int count;
        Map<String, Boolean> name = new HashMap();

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            name.put(A, false);
            name.put(B, false);
            if (A.equals(chongChong) || !name.get(A)) {
                name.put(A, true);
            } else if (B.equals(chongChong) || !name.get(B)) {
                name.put(B, true);
            }
        }
        count = (int) name.values().stream().filter(x -> x).count();
        System.out.println(count);
    }
}

