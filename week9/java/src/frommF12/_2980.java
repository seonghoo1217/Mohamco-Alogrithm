package problems.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 1:03:51
public class _2980 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        List<TrafficLight> trafficLights = new LinkedList<>();
        int K = 0;
        int F = 0;
        int position  = 0;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            trafficLights.add(new TrafficLight(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < trafficLights.size(); i++) {
            TrafficLight trafficLight = trafficLights.get(i);

            int distance = trafficLight.position - position;
            position += distance;
            F += distance;

            int P = F;
            while (true) {
                P -= trafficLight.red;
                if (P < 0) {
                    F += Math.abs(P);
                    break;
                }
                P -= trafficLight.green;
                if (P < 0) {
                    break;
                }
            }
        }

        F += (length - position);
        System.out.println(F);
    }
    static class TrafficLight{
        int position;
        int red;
        int green;

        public TrafficLight(int position, int red, int green) {
            this.position = position;
            this.red = red;
            this.green = green;
        }
    }
}

