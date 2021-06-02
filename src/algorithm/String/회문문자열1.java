package algorithm.String;

import java.util.Scanner;

public class 회문문자열1 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        회문문자열1 T = new 회문문자열1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
