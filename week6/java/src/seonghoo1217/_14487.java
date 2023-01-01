package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _14487 {
	//25m13s41

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());

		int all_cost=0;
		int MAX_VALUE=Integer.MIN_VALUE;
		for (int i=0;i<N;i++){
			int cost = Integer.parseInt(st.nextToken());
			if (cost>MAX_VALUE) MAX_VALUE=cost;

			all_cost+=cost;
		}

		System.out.println(all_cost-MAX_VALUE);
	}
}
