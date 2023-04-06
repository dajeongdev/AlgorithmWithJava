package Baekjoon.first.Level1;

import java.util.Scanner;

public class Problem10869 {
    /**
     * 문제
     * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
     *
     * 출력
     * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
     *
     * 예제 입력 1
     * 7 3
     * 예제 출력 1
     * 10
     * 4
     * 21
     * 2
     * 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String[] split = nums.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
