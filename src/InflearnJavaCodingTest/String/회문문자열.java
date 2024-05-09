package InflearnJavaCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
    /**
     *
     설명
     앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
     문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
     단 회문을 검사할 때 대소문자를 구분하지 않습니다.

     입력
     첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

     출력
     첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

     예시 입력 1
     gooG

     예시 출력 1
     YES
     */

    /**
     * 회문(palindrome): 거꾸로 읽어도 제대로 읽는 것과 같은 문장이나 낱말, 숫자, 문자열 등
     * 그러면 문자열 길이의 반만 for문 돌리고, 앞뒤가 같은지 확인하기
     */
    public static void main(String[] args) throws IOException {
        회문문자열 T = new 회문문자열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(T.solution(br.readLine().toLowerCase())); // 113ms
    }

    private String solution(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return "NO";
            }
        }
        return "YES";
    }
}
