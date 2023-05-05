package DoIt.chapter05;

import java.util.Scanner;

public class RecursiveCount {

    static int count;

    // 재귀 메서드
    static void recursive(int n) {
        count++;
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

        System.out.println("메서드를 호출한 횟수 : " + count);
    }
}
