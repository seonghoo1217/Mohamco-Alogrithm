package seonghoo1217;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class _11279 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<=N;i++){
			int num = Integer.parseInt(br.readLine());

			if (num==0){
				if (priorityQueue.isEmpty()){
					sb.append("0").append("\n");
				}else {
					sb.append(priorityQueue.poll()).append("\n");
				}
			}else {
				priorityQueue.offer(num);
			}
		}
		System.out.println(sb);
	}
}
