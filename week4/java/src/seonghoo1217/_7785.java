package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _7785 {
	//4m01s52
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		HashSet<String> now_com=new HashSet<>();
		int N = Integer.parseInt(br.readLine());

		for (int i=0;i<N;i++){
			String[] company = br.readLine().split(" ");
			if(company[1].equals("enter")){
				now_com.add(company[0]);
			}else {
				now_com.remove(company[0]);
			}
		}
		ArrayList<String> answer = new ArrayList<>(now_com);
		answer.sort(Collections.reverseOrder());
		for (String x:answer){
			System.out.println(x);
		}
	}
}
