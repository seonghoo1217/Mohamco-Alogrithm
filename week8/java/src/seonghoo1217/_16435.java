package seonghoo1217;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _16435 {
	//02m48s39

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int [] fruits=new int[N];
		st=new StringTokenizer(br.readLine());

		for (int i=0;i<N;i++){
			fruits[i]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(fruits);

		for (int i=0;i<N;i++){
			if (L>=fruits[i]) L++;
		}

		bw.write(String.valueOf(L));
		bw.flush();
	}
}
