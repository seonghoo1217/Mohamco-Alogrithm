package seonghoo1217;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1158 {
	//3m29s41
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> josepus_queue=new LinkedList<>();

		for (int i=1;i<=N;i++){
			josepus_queue.add(i);
		}
		StringBuilder sb =new StringBuilder();
		int cnt =0;
		while (!josepus_queue.isEmpty()){
			cnt++;
			if (cnt==K){
				if (josepus_queue.size()==1){
					sb.append(josepus_queue.poll());
				}else {
					sb.append(josepus_queue.poll()).append(", ");
				}
				cnt=0;
			}else {
				josepus_queue.add(josepus_queue.poll());
			}
		}
		System.out.println("<"+sb+">");
	}
}
