package seonghoo1217;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
class HomeWork{
	int day;
	int score;

	public HomeWork(int day, int score) {
		this.day = day;
		this.score = score;
	}
}
public class _13904 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<HomeWork> homeWorkList=new ArrayList<>();
		int maximum_day=0;
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			homeWorkList.add(new HomeWork(d,w));
			maximum_day=Math.max(maximum_day,d);
		}

		int totalScore=0;
		for (int i=maximum_day;i>0;i--){
			totalScore+=getMaximumScoreInday(homeWorkList,i);
		}

		System.out.println(totalScore);
	}

	public static int getMaximumScoreInday(List<HomeWork> homeWorkList,int now){
		int idx=-1;
		int result=0;
		for (int i=0;i< homeWorkList.size();i++){
			if (homeWorkList.get(i).day>=now&&result<homeWorkList.get(i).score){
				idx=i;
				result=homeWorkList.get(i).score;
			}
		}
		if (result==0){
			return 0;
		}
		homeWorkList.remove(idx);
		return result;
	}


}

