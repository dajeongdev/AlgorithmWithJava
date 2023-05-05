package DoIt.chapter05;

import java.util.Scanner;

public class RecursiveMemoCount {

    static String[] memo;
    static int count;

    // 메모화 도입
    static void recursive(int n) {
        count++;
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recursive(n - 1);
                System.out.println(n);
                recursive(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
            } else {
                memo[n + 1] = ""; // 메모화: recursive(0)과 recursive(-1)은 빈 문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = sc.nextInt();

        memo = new String[x + 2];
        recursive(x);

        System.out.println("메서드를 호출한 횟수 : " + count);
    }
}
