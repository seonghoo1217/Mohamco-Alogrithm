package seonghoo1217;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _23235 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean FLAG = true;
		for (int i = 0; i <N; i++) {
			int book_count = Integer.parseInt(br.readLine());
			String[] book_num = br.readLine().split(" ");
			int temp=200001;
			for (int k=0;k<book_count;k++){
				if (Integer.parseInt(book_num[k])>temp){
					FLAG=false;
				}
				temp=Integer.parseInt(book_num[k]);
			}
		}
		System.out.println(FLAG?"Yes":"No");
	}

}
