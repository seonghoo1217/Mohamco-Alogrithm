import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _17286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person person[] = new Person[4];

        for (int i = 0; i<person.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(person, (Comparator.comparingInt(o -> (o.x + o.y))));
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].x + " " + person[i].y);
        }

        int distance = 0;
        for (int i = 1; i < person.length; i++) {
            int x = Math.abs(person[i].x - person[i - 1].x);
            int y = Math.abs(person[i].y - person[i - 1].y);
            distance += (x+y);
        }
        System.out.println(distance);
    }

    static class Person {
        int x,y;
OAOAOA
        public Person(int x, int y) {
            this.x = x;
OAOAOA            this.y = y;
        }
OAOAOA    }
}

