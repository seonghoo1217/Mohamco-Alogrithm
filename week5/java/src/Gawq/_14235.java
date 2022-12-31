package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
// 28m51s42
public class _14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> values = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a != 0) {
                for (int j = 0; j < a; j++) {
                    values.add(Integer.parseInt(st.nextToken()));
                }
            }
            else {
                if (values.isEmpty()) {
                    result.add(-1);
                }
                else
                    result.add(values.poll());
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
