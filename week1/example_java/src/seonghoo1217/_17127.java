package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _17127 {
	private static int N;
	private static boolean[] check;
	private static final List<Integer> flowers=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		check=new boolean[N];
		StringTokenizer st=new StringTokenizer(br.readLine());

		for (int i=0;i<N;i++){
			flowers.add(Integer.parseInt(st.nextToken()));
		}
		int max =Integer.MIN_VALUE;

		for (int i=0;i<4;i++){
			int temp=1;
			temp = groupMaxSum(temp, i);
			temp = anyValueSum(temp);
			max = getMaxValue(temp, max);
			initializeCheck();
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}

	private static int groupMaxSum(int temp, int i){
		for (int j=i;j<N-3+i;j++){
			temp*=flowers.get(j);
			check[j]=true;
		}
		return temp;
	}

	private static int anyValueSum(int temp){
		for (int k=0;k<N;k++){
			if (!check[k]) temp+=flowers.get(k);
		}
		return temp;
	}

	private static int getMaxValue(int temp,int max){
		return Math.max(temp,max);
	}

	private static void initializeCheck(){
		for (int k=0;k<N;k++){
			if (check[k])
				check[k]=false;
		}
	}
}
