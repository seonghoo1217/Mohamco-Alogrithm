import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1773  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lines[] = br.readLine().split(" ");
        int n = Integer.parseInt(lines[0]), c = Integer.parseInt(lines[1]);
        int[] arr = new int[c + 1], stu = new int[n];

        for (int i = 0; i < n; i++) {
            stu[i] = Integer.parseInt(br.readLine());
        }


        stu = Arrays.stream(stu)
                .distinct()
                .toArray();

        for (int i = 0; i < stu.length; i++) {
            int k = stu[i];
            for (int j = k; j <= c; j += k) {
                arr[j] = 1;
            }
        }
        System.out.println(Arrays.stream(arr).sum());

        br.close();
    }
}
