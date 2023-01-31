package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _19532 {
	//11m32s49
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		List<Integer> list=new ArrayList<>();

		for (int i=0;i< arr.length;i++){
			list.add(Integer.parseInt(arr[i]));
		}
		for (int i=-999;i<1000;i++){
			for (int k=-999;k<1000;k++){
				if ((list.get(0)*i)+(list.get(1)*k)==list.get(2)){
					if ((list.get(3)*i)+(list.get(4)*k)==list.get(5)){
						System.out.print(i+" ");
						System.out.print(k);
					}
				}
			}
		}
	}
}
