package problems.silver;

import java.util.*;

public class _17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Stack<Character> stk = new Stack<>();

        //<> 안에 안에 있는지 밖에 있는지 구분
        //안이면 true, 밖이면 false
        boolean inout = false;

        //S를 하나씩 탐색
        for (int i = 0; i < S.length(); i++) {
            //'<'이게 오면
            if (S.charAt(i) == '<') {
                inout = true; // 태그 안

                //스택에 저장되어 있는거를 다 pop하면서 출력
                while (!stk.isEmpty()) {
                    System.out.print(stk.pop());
                }

                //'<'기호 표시
                System.out.print(S.charAt(i));
            }

            //'>' 이게 오면
            else if(S.charAt(i)=='>') {
                inout = false;
                System.out.print(S.charAt(i));
            }

            // <>안에 있으면
            else if(inout) {
                //순서 그대로 출력
                System.out.print(S.charAt(i));
            }

            // <>밖에 있으면
            else if(!inout) {
                //공백이라면
                if(S.charAt(i)==' ') {
                    //스택에 저장되어 있는거를 다 pop하면서 출력
                    while (!stk.isEmpty()) {
                        System.out.print(stk.pop());
                    }

                    //공백 출력
                    System.out.print(S.charAt(i));
                }

                //공백이 아니면
                else {
                    //스택에 넣기
                    stk.push(S.charAt(i));
                }
            }
        }

        //나머지 스택에 저장되어 있는거를 다 pop하면서 출력
        while (!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
    }
}
