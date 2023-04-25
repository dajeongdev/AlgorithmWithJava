package DoIt.chapter05;

import java.util.Scanner;


public class Q3 {

    // 정수 x, y의 최대공약수를 구하여 반환한다.
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 요소수가 no인 배열 a의 모든 요소의 최대공약수를 구한다.
    static int gcdArray(int a[], int start, int no) {
        if (no == 1) {
            return a[start];
        } else if (no == 2) {
            return gcd(a[start], a[start + 1]);
        } else {
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 최대공약수를 구할까요? : ");
        int no;
        do {
            no = sc.nextInt();
        } while (no <= 1);

        int[] x = new int[no];
        for (int i = 0; i < no; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("최대공약수는 " + gcdArray(x, 0, no) + "입니다.");
    }
}
