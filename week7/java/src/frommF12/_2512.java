import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 33:02
public class _2512 {

    static int[] v;
    static int budget;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        v = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        budget = Integer.parseInt(br.readLine());

        int i = 0;
        while (st.hasMoreTokens()) {
            v[i++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(v);

        int lo = 0;
        int hi = v[N-1] + 1;
        while (lo + 1 < hi) {
            int mid = (lo + hi) / 2;
            if(Check(mid)) lo = mid;
            else hi = mid;
        }

        System.out.println(lo);
        
    }

    public static boolean Check(int upper) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > upper) {
                sum += upper;
                continue;
            }
            sum += v[i];
        }
        return budget >= sum;
    }
}

