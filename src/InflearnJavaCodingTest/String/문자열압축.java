package InflearnJavaCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열압축 {
    /**
     * 설명
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
     * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
     * 단 반복횟수가 1인 경우 생략합니다.
     *
     * 입력
     * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
     *
     * 출력
     * 첫 줄에 압축된 문자열을 출력한다.
     *
     * 예시 입력 1
     * KKHSSSSSSSE
     * 예시 출력 1
     * K2HS7E
     *
     * 예시 입력 2
     * KSTTTSEEKFKKKDJJGG
     * 예시 출력 2
     * KST3SE2KFK3DJ2G2
     */
    public static void main(String[] args) throws IOException {
        문자열압축 T = new 문자열압축();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        StringBuilder answer = new StringBuilder();
        str += " "; // i와 i+1을(마지막 문자열까지) 비교하기 위해 마지막에 공백 문자 추가

        for (int i = 0, temp = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                temp++;
            } else {
                answer.append(str.charAt(i));
                if (temp > 1) {
                    answer.append(temp);
                }
                temp = 1;
            }
        }
        return answer.toString();
    }
}
