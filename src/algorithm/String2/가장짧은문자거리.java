package algorithm.String2;

import java.util.Scanner;

public class 가장짧은문자거리 {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000; // p -> int[]의 값

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) { // t와 같으면 p 초기화
                p = 0;
                answer[i] = p;
            } else { // t와 다름 -> p값 증가
                p++;
                answer[i] = p;
            }
        }

        // for 문이 반대로 돌면서 오른쪽으로부터 e와 비교하여 작은 값으로 교체
        p = 1000;
        for(int i = s.length() - 1; i >= 0; i--) { // 반대로 돌기
            if(s.charAt(i) == t) { // t와 같으니 p 초기화
                p = 0;
            } else { // t와 다르니 p값 증가 및 최소값으로 변경
                p++;
                answer[i] = Math.min(answer[i], p); // 기존 p값과 지금 p값 중 최소값을 넣음
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        가장짧은문자거리 T = new 가장짧은문자거리();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);

        for(int n : T.solution(s, t)) {
            System.out.print(n + " ");
        }
    }
}
