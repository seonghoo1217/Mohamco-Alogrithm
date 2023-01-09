package seonghoo1217;

import java.io.*;

public class _2930 {
	//17m49s21
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int R = Integer.parseInt(br.readLine());
		String[] sg;

		sg = br.readLine().split("");

		int N = Integer.parseInt(br.readLine());
		String[][] friends = new String[N][R];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			friends[i] = s.split("");
		}

		int sum = 0, maxSum = 0;
		for (int j = 0; j < R; j++) {
			int[] arr = new int[3];
			for (int i = 0; i < N; i++) {
				arr[0] += check_win("S", friends[i][j]);
				arr[1] += check_win("P", friends[i][j]);
				arr[2] += check_win("R", friends[i][j]);

				sum += check_win(sg[j], friends[i][j]);
			}
			maxSum += Math.max(arr[0], Math.max(arr[1], arr[2]));
		}
		System.out.println(sum);
		System.out.println(maxSum);
	}

	public static int check_win(String a, String b) {
		if (a.equals("S")) {
			if (b.equals("S")) return 1;
			if (b.equals("P")) return 2;
			if (b.equals("R")) return 0;
		}
		if (a.equals("P")) {
			if (b.equals("S")) return 0;
			if (b.equals("P")) return 1;
			if (b.equals("R")) return 2;
		}
		if (a.equals("R")) {
			if (b.equals("S")) return 2;
			if (b.equals("P")) return 0;
			if (b.equals("R")) return 1;
		}
		return 0;
	}
}
