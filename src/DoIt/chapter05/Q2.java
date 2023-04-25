package DoIt.chapter05;

import java.util.Scanner;

// 재귀 메서드 호출을 사용하지 않고 gcd 메서드 작성하기
public class Q2 {

    // 정수 x, y의 최대공약수를 구하여 반환한다.
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요. : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요. : ");
        int y = sc.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
    }
}
