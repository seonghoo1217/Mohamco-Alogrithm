import java.io.*;
import java.util.*;
//1:23:51
public class _13689 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> listA = new ArrayList<>();
        List<String> listB;
        String s1;

        listA.add(0, "small");
        listA.add(1, "empty");
        listA.add(2, "empty");
        listA.add(3, "big");

        s1 = br.readLine();
        listB = List.of(s1.split(""));

        mix(listA, listB);

        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i).equals("small")) {
                bw.write(i+1+"\n");
                bw.flush();
            }
        }
        for (int i = 0; i< listA.size(); i++) {
            if (listA.get(i).equals("big")) {
                bw.write(String.valueOf(i+1));
                bw.flush();
                bw.close();
            }
        }
    }

    private static List<String> mix(List<String> listA, List<String> listB) {
        String temp;
        for (String arr : listB) {
            switch (arr) {
                case "A":
                    temp = listA.get(0);
                    listA.set(0, listA.get(1));
                    listA.set(1, temp);
                    break;
                case "B":
                    temp = listA.get(0);
                    listA.set(0, listA.get(2));
                    listA.set(2, temp);
                    break;
                case "C":
                    temp = listA.get(0);
                    listA.set(0, listA.get(3));
                    listA.set(3, temp);
                    break;
                case "D":
                    temp = listA.get(1);
                    listA.set(1, listA.get(2));
                    listA.set(2, temp);
                    break;
                case "E":
                    temp = listA.get(1);
                    listA.set(1, listA.get(3));
                    listA.set(3, temp);
                    break;
                case "F":
                    temp = listA.get(2);
                    listA.set(2, listA.get(3));
                    listA.set(3, temp);
                    break;
            }
        }
        return listA;
    }

}
