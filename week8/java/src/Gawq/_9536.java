package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _9536 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> cry = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(input.readLine());
            while(st.hasMoreTokens()) {
                list.add(st.nextToken());
            }

            while (true) {
                String s = input.readLine();
                st = new StringTokenizer(s);
                if (s.equals("what does the fox say?")) break;
                for (int j = 0; j < 3; j++) {
                    if (j == 2) {
                        cry.add(st.nextToken());
                    }
                    else st.nextToken();
                }
            }

            for (int k = 0; k < list.size(); k++) {
                for (int l = 0; l < cry.size(); l++) {
                    if (list.get(0).equals(cry.get(l))) {
                        list.remove(0);
                    }
                    if (list.get(k).equals(cry.get(l))) {
                        list.remove(k);
                        k = 0;
                        break;
                    }
                }
            }

            for (String s : list) {
                System.out.print(s + " ");
            }
        }

    }

    private static String src = "1\n" +
            "meow toot woof meow wa ow ow meow ow pa blub blub pa toot meow meow pa blub pa pa ow pow toot\n" +
            "dog goes woof\n" +
            "fish goes blub\n" +
            "elephant goes toot\n" +
            "seal goes ow\n" +
            "cat goes meow\n" +
            "what does the fox say?";
}
