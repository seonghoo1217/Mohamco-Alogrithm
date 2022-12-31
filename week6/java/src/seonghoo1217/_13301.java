package seonghoo1217;

import java.io.*;

public class _13301 {
	//23m11s09
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long answer=0;
		for (long i=1;i<=N;i++){
			if (i==N-1) answer+=fibonaci(i);
			if (i==N) answer+=fibonaci(i)*2L;
		}

		bw.write(String.valueOf(answer*2));
		bw.flush();
		bw.close();
	}

	public static long fibonaci(long index){
		if (index<=1)
			return index;
		else {
			return fibonaci(index-2)+fibonaci(index-1);
		}
	}
}
