package Baekjoon.Level6;

import java.util.Scanner;

public class Problem27866 {
    /**
     * [문자와 문자열]
     * 문제
     * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
     * 둘째 줄에 정수 i가 주어진다. (1 <= i <= S)
     *
     * 출력
     * S의 i번째 글자를 출력한다.
     *
     * 예제 입력 1
     * Sprout
     * 3
     * 예제 출력 1
     * r
     *
     * 예제 입력 2
     * shiftpsh
     * 6
     * 예제 출력 2
     * p
     *
     * 예제 입력 3
     * Baekjoon
     * 4
     * 예제 출력 3
     * k
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(str.charAt(num - 1));
    }
}
