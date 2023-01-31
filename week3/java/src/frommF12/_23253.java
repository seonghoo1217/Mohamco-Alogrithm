import java.io.*;
import java.util.*;

// 1:15:07
public class _23253 {

    private static String result = "Yes";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int allTextBook = Integer.parseInt(input.nextToken());
        int dummy = Integer.parseInt(input.nextToken());

        for (int i = 0; i < dummy; i++) {

            int textBookNumber = Integer.parseInt(br.readLine());
            StringTokenizer textBook = new StringTokenizer(br.readLine());
            int max = Integer.MAX_VALUE;

            for (int j = 0; j < textBookNumber; j++) {
                int temp = Integer.parseInt(textBook.nextToken());
                if (temp > max) {
                    result = "No";
                }
                max = temp;
            }
        }
        System.out.println(result);
    }

}

