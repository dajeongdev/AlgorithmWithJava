package algorithm.String2;

import java.util.Scanner;

public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                /* 문자가 있으면 해당 문자의 인덱스를 리턴
                   -> 0번째 인덱스의 값인 k의 인덱스 0와 i의 값이 같을 때만 넣음
                   -> 0번째 인덱스의 값인 k의 인덱스 0과 3은 다르므로 안 넣음 (중복 불가)*/
                answer += str.charAt(i); // 해당 인덱스의 문자열을 넣음
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        중복문자제거 T = new 중복문자제거();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}
