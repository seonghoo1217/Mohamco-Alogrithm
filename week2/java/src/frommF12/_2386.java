import java.io.*;
import java.util.StringTokenizer;

public class _2386 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer readString = new StringTokenizer(br.readLine());

            String inputCharacter = readString.nextToken();

            if (inputCharacter.equals("#")) {
                break;
            }

            int count = 0;
            char matchAlphabet = inputCharacter.charAt(0);

            while (readString.hasMoreTokens()) {
                String string = readString.nextToken().toLowerCase();
                char[] chars = string.toCharArray();

                for (char char_ : chars) {
                    if (matchAlphabet == char_) {
                        count++;
                    }
                }
            }

            String result = matchAlphabet + " "  + count;
            System.out.println(result);
        }

        br.close();
        bw.close();
        return;
    }
}

