import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 36:11
public class _1813 {

    static int[] array = new int[51];
    static int index;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st  = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            index = Integer.parseInt(st.nextToken());
            array[index]++;
        }

        for (int i = 0; i < 51; i++) {
            if (array[i] == 0) {
                continue;
            }
            if (i == array[i]) {
                result = i;
            }
        }

        if (array[0] >= 1 && result == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(result);
    }
}
