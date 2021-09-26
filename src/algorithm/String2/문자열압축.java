package algorithm.String2;

import java.util.Scanner;

public class 문자열압축 {
    public String solution(String str) {
        String answer = "";
        str = str + " "; // 마지막 순서와 비교하기 위해 빈 문자열 삽입
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++) { // 빈 문자열 전까지 반복
            if(str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1) {
                    answer += String.valueOf(cnt); // or Integer.toString();
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열압축 T = new 문자열압축();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
