package seonghoo1217;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _14235 {
	//7m14s41

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) -> {
			return o2-o1;
		});
		StringBuilder sb=new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i=0;i<N;i++){
			String value=br.readLine();
			if (value.equals("0")){
				if (queue.isEmpty()){
					sb.append(-1).append("\n");
				}else {
					sb.append(queue.poll()).append("\n");
				}
			}
			else {
				StringTokenizer st=new StringTokenizer(value);
				int temp = Integer.parseInt(st.nextToken());
				for (int k=0;k<temp;k++){
					queue.add(Integer.parseInt(st.nextToken()));
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
