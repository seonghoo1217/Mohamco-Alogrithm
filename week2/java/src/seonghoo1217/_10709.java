package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

/*3 4
		c..c
		..c.
		....*/
public class _10709 {
	//8m18s28
	static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int H=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());

		for (int i=0;i<H;i++){
			List<Character> list=new ArrayList<>();
			char[] weather_info = br.readLine().toCharArray();
			for (int k=0;k<W;k++){
				list.add(weather_info[k]);
			}
			getWeather(list);
			sb.append("\n");
		}

		System.out.println(sb);
	}

	private static void getWeather(List<Character> list){
		int temp=-1;
		for (int i=0;i<list.size();i++){
			if (list.get(i)=='c') {
				temp=0;
			}
			if (list.get(i)=='.'&&temp>=0){
				temp++;
			}
			sb.append(temp).append(" ");
		}
	}
}
