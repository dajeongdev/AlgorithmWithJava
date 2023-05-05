package DoIt.chapter05;

import java.util.Scanner;

public class Q4 {

    static void recursive(int n) {
        if (n > 0) {
            recursive(n - 2);
            System.out.println(n);
            recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = sc.nextInt();

        recursive(x);
    }
}
