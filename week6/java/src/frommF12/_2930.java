package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 48:11
public class _2930 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int round = Integer.parseInt(br.readLine());
        char[] sanggeun = br.readLine().toCharArray();
        int friendsNum = Integer.parseInt(br.readLine());
        char[][] friend = new char[friendsNum][];

        int result = 0;
        int maxResult = 0;

        for (int i = 0; i < friendsNum; i++) {
            friend[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < round; i++) {
            int p,r,s;
            int max = 0;
            p = r = s = 0;
            for (int j = 0; j < friendsNum; j++) {
                p += game('P', friend[j][i]);
                r += game('R', friend[j][i]);
                s += game('S', friend[j][i]);

                result += game(sanggeun[i], friend[j][i]);
            }
            max = Math.max(p, r);
            max = Math.max(max, s);
            maxResult += max;
        }
        System.out.println(result);
        System.out.println(maxResult);
    }

    public static int game(char sanggeun, char friend) {
        if (sanggeun == 'P') {
            if(friend == 'P') return 1;
            if(friend == 'R') return 2;
            if(friend == 'S') return 0;
        }
        if (sanggeun == 'R') {
            if(friend == 'P') return 0;
            if(friend == 'R') return 1;
            if(friend == 'S') return 2;
        }
        if (sanggeun == 'S') {
            if(friend == 'P') return 2;
            if(friend == 'R') return 0;
            if(friend == 'S') return 1;
        }
        return 0;
    }
}

