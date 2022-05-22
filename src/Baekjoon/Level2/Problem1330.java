package Baekjoon.Level2;

import java.util.Scanner;

public class Problem1330 {
    /**
     * [두 수 비교하기]
     * 문제
     * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
     *
     * 출력
     * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
     * A가 B보다 큰 경우에는 '>'를 출력한다.
     * A가 B보다 작은 경우에는 '<'를 출력한다.
     * A와 B가 같은 경우에는 '=='를 출력한다.
     *
     * 제한
     * -10,000 ≤ A, B ≤ 10,000
     *
     * 예제 입력 1
     * 1 2
     * 예제 출력 1
     * <
     * 예제 입력 2
     * 10 2
     * 예제 출력 2
     * >
     * 예제 입력 3
     * 5 5
     * 예제 출력 3
     * ==
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] split = nums.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        String symbol = "";
        if (A > B) {
            symbol = ">";
        } else if (A < B) {
            symbol = "<";
        } else {
            symbol = "==";
        }
        System.out.println(symbol);
    }
}
