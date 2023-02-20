package seonghoo1217;

import java.io.*;
import java.util.Stack;

public class _17413 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack=new Stack<>();
		String line = br.readLine();

		StringBuilder sb=new StringBuilder();
		boolean flag=false;

		for (int i=0;i<line.length();i++){
			char word = line.charAt(i);
			if (word=='<'){
				while (!stack.isEmpty()){
					sb.append(stack.pop());
				}
				flag=true;
			}else if(word=='>'){
				flag=false;
				sb.append(word);
				continue;
			}
			if (flag) sb.append(word);
			else{
				if (word==' '){
					while (!stack.isEmpty()){
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				}else {
					stack.push(word);
				}
			}

			if (i==line.length()-1){
				while (!stack.isEmpty()){
					sb.append(stack.pop());
				}
			}
		}

		System.out.println(sb);
	}
}
