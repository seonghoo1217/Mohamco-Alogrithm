package seonghoo1217;

import java.io.*;
import java.util.HashMap;

public class _2002 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<String,Integer> map=new HashMap<>();
		int answer=0;
		for (int i=0;i<N;i++){
			map.put(br.readLine(),i);
		}

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			arr[i] = map.get(input);
		}

		for(int i = 0; i< N-1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					answer ++;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
