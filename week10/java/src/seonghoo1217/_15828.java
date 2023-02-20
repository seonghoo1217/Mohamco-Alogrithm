package seonghoo1217;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _15828 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<String> queue=new LinkedList<>();

		int N = Integer.parseInt(br.readLine());
		while (true){
			String packet = br.readLine();

			if (packet.equals("-1")) break;

			if (packet.equals("0")) queue.poll();
			else if (N>queue.size()) queue.offer(packet);

		}
		if (queue.isEmpty()){
			System.out.println("empty");
		}else {
			StringBuilder sb=new StringBuilder();
			for (String i :queue){
				sb.append(i+" ");
			}
			System.out.println(sb);
		}
	}
}
