package algorithm.String;

import java.util.Scanner;

public class 문자열압축 {
    public String solution(String str) {
        String answer = "";
        str = str + " "; // i와 i+1을 비교해야하는데 마지막 문자열 순서가 되면 +1을 할 수 없으므로 빈 문자열 삽입
        int cnt = 1;

        for(int i = 0; i < str.length() - 1; i++) { // 빈 문자열 전까지만
            if(str.charAt(i) == str.charAt(i + 1)) { // i와 i+1을 비교해서 같으면 숫자 증가
                cnt++;
            } else { // i와 i+1을 비교해서 다르면 문자 더하기
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

        System.out.println(T.solution(str));
    }
}
