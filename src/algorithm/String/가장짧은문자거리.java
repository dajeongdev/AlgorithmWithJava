package algorithm.String;

import java.util.Scanner;

public class 가장짧은문자거리 {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        // 오른쪽의 값과도 비교해서 작은 값으로 교체
        p = 1000;
        for (int i = s.length() -1; i >= 0; i--) { // 오른쪽으로부터 거꾸로
            if(s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가장짧은문자거리 T = new 가장짧은문자거리();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        for(int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
