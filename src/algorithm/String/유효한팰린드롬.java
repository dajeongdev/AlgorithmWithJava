package algorithm.String;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳만 출력시키는 정규식

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        유효한팰린드롬 T = new 유효한팰린드롬();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
}
