import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1551 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer input = new StringTokenizer(br.readLine());
        StringTokenizer element = new StringTokenizer(br.readLine(), ",");

        Integer elementCount = Integer.valueOf(input.nextToken());
        Integer iterNumber = Integer.valueOf(input.nextToken());


        int[] temp = new int[elementCount];
        int[] result = new int[elementCount];
        StringBuilder answer = new StringBuilder();

        int i =0;
        while (element.hasMoreTokens()) {
            temp[i] = Integer.valueOf(element.nextToken());
            result[i] = temp[i];
            i++;
        }

        for (i = 0; i < iterNumber; i++) {
            for (int j = 0; j < elementCount-i-1; j++) {
                result[j] = temp[j+1] - temp[j];
            }
            for (int k = 0; k < elementCount; k++) {
                temp[k] = result[k];
            }
        }

        for (i = 0; i < elementCount-iterNumber; i++) {
            if (i == 0) {
                answer.append(result[i]);
                continue;
            }
            answer.append("," + result[i]);
            continue;
        }
        System.out.println(answer);
    }
}

