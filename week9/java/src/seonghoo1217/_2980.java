package seonghoo1217;

import java.io.*;
import java.util.StringTokenizer;

public class _2980 {
	//54m51s27

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		Light[] lights=new Light[N+1];
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int G = Integer.parseInt(st.nextToken());
			lights[i]=new Light(D,R,G);
		}
		int time=0;
		for (int i=0;i<N;i++){
			if (i==0){
				time+=lights[i].position;
			}else {
				time+=(lights[i].position-lights[i-1].position);
			}
			int terms = time / (lights[i].red + lights[i].green);
			int tmpTime = time - (terms * (lights[i].red + lights[i].green));

			if(tmpTime<lights[i].red)
				time += (lights[i].red - tmpTime);
			else
				continue;
		}
		time+=(L-lights[N-1].position);
		System.out.println(time);
	}

	static class Light {
		int position;
		int red;
		int green;

		public Light(int position, int red, int green) {
			this.position = position;
			this.red = red;
			this.green = green;
		}
	}
}
