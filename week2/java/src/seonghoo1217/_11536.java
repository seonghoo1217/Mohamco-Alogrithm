package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11536 {
	//3m09s44
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		List<String> name_list=new ArrayList<>();
		for (int i=0;i<N;i++){
			name_list.add(br.readLine());
		}
		bw.write(getAnswer(name_list));
		bw.flush();
		bw.close();
	}

	private static String getAnswer(List<String> nameList){
		List<String> copy=new ArrayList<>(nameList);
		Collections.sort(copy);
		if (nameList.equals(copy)){
			return "INCREASING";
		}
		copy.sort(Collections.reverseOrder());
		if (nameList.equals(copy)){
			return "DECREASING";
		}

		return "NEITHER";
	}
}
