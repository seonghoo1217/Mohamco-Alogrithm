package seonghoo1217;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _5635 {
	//13m04s55
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String [][] user_info=new String[N][4];

		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			user_info[i][0]=st.nextToken();
			user_info[i][1]=st.nextToken();
			user_info[i][2]=st.nextToken();
			user_info[i][3]=st.nextToken();
		}

		Arrays.sort(user_info, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[3])==Integer.parseInt(o2[3])){
					if (Integer.parseInt(o1[2])==Integer.parseInt(o2[2])){
						return Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1]));
					}else {
						return Integer.compare(Integer.parseInt(o1[2]),Integer.parseInt(o2[2]));
					}
				}
				return Integer.compare(Integer.parseInt(o1[3]),Integer.parseInt(o2[3]));
			}
		});

		System.out.println(user_info[N-1][0]);
		System.out.println(user_info[0][0]);
	}
}
