package seonghoo1217;

import java.io.*;
import java.util.*;

public class _1773 {

	//08m36s21

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());

		int student = Integer.parseInt(st.nextToken());
		int max_sec = Integer.parseInt(st.nextToken());
		boolean[] check=new boolean[max_sec+1];
		int count =0;

		for (int i=0;i<student;i++){
			int boom = Integer.parseInt(br.readLine());
			for (int k=1;k<=max_sec;k++){
				if (k%boom==0&& !check[k]){
					count++;
					check[k]=true;
				}
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
