package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//35:31:48
public class _1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while (!queue.isEmpty()) {
            cnt++;
            if(cnt == K) {
                if (queue.size() == 1) {
                    sb.append(queue.poll());
                }
                else {
                    sb.append(queue.poll()).append(", ");
                }
                cnt = 0;
            }
            else {
                queue.offer(queue.poll());
            }
        }
        System.out.println("<"+sb+">");
    }
}
