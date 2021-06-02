package algorithm.String;

import java.util.Scanner;

public class 대소문자변환2 {
    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(x >= 65 && x <= 90) {
                answer += (char)(x + 32);
            } else if(x >= 97 && x <= 122) {
                answer += (char)(x - 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대소문자변환1 T = new 대소문자변환1();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
