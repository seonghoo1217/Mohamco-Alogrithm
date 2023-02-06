package seonghoo1217;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class _9536 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();

		for (int i=0;i<N;i++){
			String[] arr = br.readLine().split(" ");
			String line="";
			while (!(line=br.readLine()).equals("what does the fox say?")){
				for (int k=0;k<arr.length;k++){
					if (arr[k]!=null&&arr[k].equals(line.split(" ")[2])){
						arr[k]=null;
					}
				}
			}

			for (int j=0;j< arr.length;j++){
				if (arr[j]!=null) sb.append(arr[j]).append(" ");
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
	}
}
