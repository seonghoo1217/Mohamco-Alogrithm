package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            else if (n == 0) {
                q.poll();
                count--;
            }
            else {
                if (count >= N) {
                }
                else {
                    q.add(n);
                    count++;
                }
            }
        }
        if (q.size() == 0) {
            System.out.println("empty");
        }
        else {
            Iterator iter = q.iterator();
            while (iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }
        }
    }
}