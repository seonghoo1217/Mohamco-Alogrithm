package seonghoo1217;

import java.io.*;

public class _25497 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S=0,L=0;
		int answer=0;
		br.readLine();
		String skill = br.readLine();
		boolean check=true;
		for (int i=0;check&&i<skill.length();i++){
			check=true;
			switch (skill.charAt(i)){
				case 'L': L++; break;
				case 'S': S++; break;
				case 'R': if (L==0) check=false;else {answer++;L--;} break;
				case 'K': if (S==0) check=false;else {answer++;S--;} break;
				default:answer++;
			}
		}
		System.out.println(answer);
	}
}
