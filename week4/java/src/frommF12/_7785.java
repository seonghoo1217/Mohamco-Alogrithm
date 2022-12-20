import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 20:31
public class _7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();

        int logNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < logNum; i++) {
            StringTokenizer log = new StringTokenizer(br.readLine());
            String name = log.nextToken();
            String enter = log.nextToken();

            if (enter.equals("leave")) {
                set.remove(name);
                continue;
            }
            set.add(name);
        }

        List<String> result = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (String s : result) {
            System.out.println(s);
        }
    }
}
