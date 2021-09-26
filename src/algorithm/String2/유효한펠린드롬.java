package algorithm.String2;

import java.util.Scanner;

public class 유효한펠린드롬 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) { // 문자만 남긴 str과 str을 뒤집은 tmp가 같다면
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        유효한펠린드롬 T = new 유효한펠린드롬();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
