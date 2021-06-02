package algorithm.String;

import java.util.Scanner;

public class 회문문자열2 { // StringBuilder 사용
    public String solution(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();

        if(!str.equalsIgnoreCase(tmp)) { // 대소문자 구분없이 같지 않을 때
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        회문문자열2 T = new 회문문자열2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
