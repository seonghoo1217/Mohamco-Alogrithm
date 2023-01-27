package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _1592 {
	//08m10s31

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int [] arr=new int[N];

		int cnt =0;

		arr[0]=1;
		int address=1;

		while (true){
			if (arr[address]==M) break;

			if (arr[address]%2==1) address=address+L;
			else address=address-L;

			if (address>N) address%=N;
			else if (address<1) address+=N;

			arr[address]++;
			cnt++;
		}
		System.out.println(cnt);
	}
}
