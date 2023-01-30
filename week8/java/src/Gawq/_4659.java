package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
// 37m41s
public class _4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new StringReader(src));
        StringBuilder sb = new StringBuilder();
        char[] vowles = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String s = input.readLine();
            if (s.equals("end")) break;
            else {
                boolean acceptable = true;
                boolean hasVowel = false;
                int cntVowel = 0;
                int cntConsonant = 0;
                for (int i = 0; i < s.length(); i++) {
                    char cur = s.charAt(i);
                    boolean isVowel = false;
                    for (int j = 0; j < vowles.length; j++) {
                        if (cur == vowles[j]) {
                            isVowel = true;
                            hasVowel = true;
                            cntVowel++;
                            cntConsonant = 0;
                            break;
                        }
                    }
                    if(!isVowel) {
                        cntConsonant++;
                        cntVowel = 0;
                    }
                    if (i == s.length() - 1) {
                        if (!hasVowel) {
                            sb.append("<" + s + "> is not acceptable.").append("\n");
                            acceptable = false;
                            break;
                        }
                    }
                    if (i >= 1) {
                        if (cur == s.charAt(i - 1) && cur != 'e' && cur != 'o') {
                            sb.append("<" + s + "> is not acceptable.").append("\n");
                            acceptable = false;
                            break;
                        } else if (cntVowel >= 3 || cntConsonant >= 3) {
                            sb.append("<" + s + "> is not acceptable.").append("\n");
                            acceptable = false;
                            break;
                        }
                    }
                }
                if (acceptable) sb.append("<" + s + "> is acceptable.").append("\n");
            }
        }
        System.out.println(sb);
    }

    private static String src = "a\n" +
            "tv\n" +
            "ptoui\n" +
            "bontres\n" +
            "zoggax\n" +
            "wiinq\n" +
            "eep\n" +
            "houctuh\n" +
            "end";
}
