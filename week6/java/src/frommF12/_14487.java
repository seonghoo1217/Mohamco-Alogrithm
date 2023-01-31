package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 38:07
public class _14487 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int village = Integer.parseInt(br.readLine());
        StringTokenizer costList = new StringTokenizer(br.readLine());
        List<Integer> cost = new ArrayList<>();

        while (costList.hasMoreTokens()) {
            cost.add(Integer.valueOf(costList.nextToken()));
        }

        Optional<Integer> optionalMax = cost.stream().max(Comparator.naturalOrder());
        int max = optionalMax.get();
        System.out.println(max);

        Optional<Integer> result = cost.stream().reduce(Integer::sum);
        System.out.println(result.get()-max);

    }
}

