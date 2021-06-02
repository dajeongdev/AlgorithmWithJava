package algorithm.String;

import java.util.Scanner;

public class 숫자만추출2 { // 메소드 사용
    public int solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        숫자만추출1 T = new 숫자만추출1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
