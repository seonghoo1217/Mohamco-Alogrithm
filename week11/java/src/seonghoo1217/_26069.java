package seonghoo1217;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class _26069 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> hashSet=new LinkedHashSet<>();
		hashSet.add("ChongChong");
		StringTokenizer st;
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			String own = st.nextToken();
			String geu = st.nextToken();
			if (hashSet.contains(own)) {
				hashSet.add(geu);
			}
			if (hashSet.contains(geu)){
				hashSet.add(own);
			}
		}
		System.out.println(hashSet.size());
	}
}
