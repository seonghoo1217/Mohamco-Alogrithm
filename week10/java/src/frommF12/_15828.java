import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

// 30 ~ ? 
public class _15828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int input;
        Queue<Integer> q = new ArrayDeque<>(N);
        StringBuilder sb = new StringBuilder();

        while (true) {
            input = Integer.parseInt(br.readLine());

            if (input == -1) {
                break;
            }

            if (input == 0) {
                q.remove();
            } else if (N > q.size()) {
                q.add(input);
            }
        }

        if (q.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i : q) {
                sb.append(i + " ");
            }
            System.out.print(sb);
        }
    }
}

