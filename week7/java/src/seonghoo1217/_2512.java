package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _2512 {
	//19m01s48

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int country = Integer.parseInt(br.readLine());
		int [] costs=new int[country];

		long left=0,right=-1;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<country;i++){
			costs[i]=Integer.parseInt(st.nextToken());
			right=Math.max(right,costs[i]);
		}

		int budget = Integer.parseInt(br.readLine());
		long answer=0;
		while (left<=right){
			long mid=(left+right)/2;
			long sum=0;
			for (int money:costs){
				if (money>=mid) sum+=mid;
				else sum+=money;
			}

			if (sum>budget){
				right=mid-1;
			}else {
				left=mid+1;
				answer=Math.max(answer,mid);
			}
		}
		System.out.println(right);
	}
}
