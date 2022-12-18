package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _1813 {
	//8m49s32
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	    int answer=-1;

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int [] arr=new int[51];

		for (int i=0;i<N;i++){
			arr[Integer.parseInt(st.nextToken())]++;
		}

		for (int i=N;i>=0;i--){
			if (arr[i]==i){
				answer=i;
				break;
			}
		}

		System.out.println(answer);
	}
}
