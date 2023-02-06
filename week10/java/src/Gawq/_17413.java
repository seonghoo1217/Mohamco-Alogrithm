package Gawq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean inout = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                inout = true;

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(str.charAt(i));
            }
            else if (str.charAt(i) == '>') {
                inout = false;
                System.out.print(str.charAt(i));
            }
            else if (inout) {
                System.out.print(str.charAt(i));
            }
            else if (!inout) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(str.charAt(i));
                }
                else {
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
