import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// 09:42
public class _11279 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int input;
        StringBuilder sb = new StringBuilder();
        PriorityQueue q = new PriorityQueue(N, Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (q.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                sb.append(q.poll() + "\n");
                continue;
            }
            q.offer(input);
        }
        System.out.println(sb);
    }
}

