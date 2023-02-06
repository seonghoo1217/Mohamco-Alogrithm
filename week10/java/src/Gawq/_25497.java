package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split("");

        int count = 0;
        base : for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("L")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j].equals("R")) {
                        count++;
                        break;
                    }
                    else if (arr[j].equals("K")) {
                        continue base;
                    }
                }
            }
            else if (arr[i].equals("S")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j].equals("K")) {
                        count++;
                        break;
                    }
                    else if (arr[j].equals("L")) {
                        continue base;
                    }
                }
            }
            else if (arr[i].equals("R") || arr[i].equals("K")) {
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
