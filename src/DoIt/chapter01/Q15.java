package DoIt.chapter01;

import java.util.Scanner;

public class Q15 {

    // 왼쪽 아래가 직각인 이등변 삼각형을 출력한다.
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변 삼각형을 출력한다.
    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // 오른쪽 위가 직각인 이등변 삼각형을 출력한다.
    static void triangleRU(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    // 오른쪽 아래가 직각인 이등변 삼각형을 출력한다.
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // n단의 피라미드를 출력한다.
    static void pyramid(int n) {}
    // 4 -> 1, 3, 5, 7

    // n단의 숫자 피라미드를 출력한다.
    static void nPyramid(int n) {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
        System.out.println();

//        pyramid(n);
//        System.out.println();
//        nPyramid(n);
    }
}
