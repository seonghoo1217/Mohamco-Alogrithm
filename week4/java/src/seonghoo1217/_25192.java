package seonghoo1217;

import java.io.*;
import java.util.HashSet;

public class _25192 {
	//2m31s14
	private static HashSet<String> userName_set=new HashSet<>();
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int answer=0;
		for (int i=0;i<N;i++){
			String user_name = br.readLine();
			if (user_name.equals("ENTER")){
				answer+=userName_set.size();
				initialize_set();
			}else {
				getUsernameAnswer(user_name);
			}
		}
		answer+= userName_set.size();
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	private static void getUsernameAnswer(String user_name){
		userName_set.add(user_name);
	}

	private static void initialize_set(){
		userName_set.clear();
	}
}
