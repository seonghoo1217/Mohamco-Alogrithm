package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _19592 {
	//23m08s51

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

	    StringBuilder sb=new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0){
			StringTokenizer st=new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			double max=X;


			st=new StringTokenizer(br.readLine());
			for (int k=0;k<N-1;k++){
				int sec = Integer.parseInt(st.nextToken());
				max=Math.min(max,1.0*X/sec);
			}

			int V = Integer.parseInt(st.nextToken());
			if (max>1.0*X/V) {
				sb.append(0).append('\n');
				continue;
			}

			int left=0;
			int right=Y;

			while (left<=right){
				int mid = (left + right) / 2;
				double booster = 1 + 1.0 * (X - mid) / V;
				if (booster >= max) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}

			if (left>Y){
				sb.append(-1).append("\n");
			}else {
				sb.append(left).append("\n");
			}
		}
		System.out.println(sb);
	}
}
