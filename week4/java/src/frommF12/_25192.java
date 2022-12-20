import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 48:16
public class _25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalChatNum = Integer.parseInt(br.readLine());
        int result = 0;

        Set<String> nicknames = new HashSet<>();

        for (int i = 0; i < totalChatNum; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                result += nicknames.size();
                nicknames.clear();
                continue;
            }

            nicknames.add(input);
        }
        result += nicknames.size();

        System.out.println(result);
    }
}

