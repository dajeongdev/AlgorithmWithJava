package algorithm.String2;

import java.util.Scanner;

public class 숫자만추출 {
    public int solution(String str) {
        int answer = 0;

        for(char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }
        /*
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
         */
        return answer;
    }
    public static void main(String[] args) {
        숫자만추출 T = new 숫자만추출();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
