package algorithm.String;

import java.util.Scanner;

public class 숫자만추출1 { // 아스키코드 사용
    public int solution(String str) {
        int answer = 0;

        for(char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자만추출1 T = new 숫자만추출1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
