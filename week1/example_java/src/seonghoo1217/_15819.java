package seonghoo1217;

import java.io.*;
import java.util.*;

public class _15819 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int search = Integer.parseInt(st.nextToken())-1;
		List<String> handle_list=new ArrayList<>();

		for (int i=0;i<N;i++){
			handle_list.add(br.readLine());
		}

		Collections.sort(handle_list);

		bw.write(handle_list.get(search));
		bw.flush();
		bw.close();
	}


}
