package DoIt.chapter05;

import java.util.Scanner;

// 재귀함수 이해하기
public class RecursiveFunction {

    static void recursive2(int n) {
        if (n > 0) {
            recursive2(n - 2);
            System.out.println(n);
            recursive2(n - 1);
        }
    }

    // 재귀 함수
    static void recursive(int n) {
        if (n > 0) {
            recursive(n - 1);
            System.out.println(n);
            recursive(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = sc.nextInt();

        recursive(x);
        System.out.println();
        recursive2(x);
    }
}
