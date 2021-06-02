package algorithm.String;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0; // s의 첫번째 인덱스
        int rt = str.length() -1; // s의 마지막 인덱스

        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) { // 알파벳이 아닐 떄
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
