package seonghoo1217;

import java.io.*;
import java.util.Stack;

public class _25497 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int S=0,L=0;
		int answer=0;
		int N = Integer.parseInt(br.readLine());
		String skill = br.readLine();
		boolean check=true;
		Stack<Character> stack=new Stack<>();
		for (int i=0;i<N;i++){
			char part = skill.charAt(i);
			if (part=='S') S++;
			if (part=='L') L++;
			stack.push(part);
		}

		for (int i=0;check&&i<N;i++){
			check=true;
			char peek = stack.peek();
			switch (peek){
				case 'S':
				case 'L':
					stack.pop(); break;
				case 'R': if (L==0) check=false;else {answer++;L--;stack.pop();} break;
				case 'K': if (S==0) check=false;else {answer++;S--;stack.pop();} break;
				default:answer++; stack.pop();
			}
		}
		System.out.println(answer);
	}
}
