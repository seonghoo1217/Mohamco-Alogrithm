import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 50:23
public class _1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        result.append("<");
        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                Integer temp = queue.poll();
                queue.add(temp);
            }
            result.append(queue.poll() + ", ");
        }
        result.append(queue.poll() + ">");

