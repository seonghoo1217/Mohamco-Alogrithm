package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _2960 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		boolean [] primeNum=new boolean[N+1];

		int cnt=0;
		for (int i=2;i<=N;i++){
			primeNum[i]=true;
		}

		for (int i=2;i<=N;i++){
			for (int j=i;j<=N;j++){
				if (!primeNum[j])
					continue;
				primeNum[j]=false;
				cnt++;
				if (cnt==K){
					System.out.println(j);
					return;
				}
			}
		}
	}
}
