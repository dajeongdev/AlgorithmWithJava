package DoIt.chapter02;

import java.util.Scanner;

public class Q2to3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2 + 1; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();

            swap(a, i, a.length - i - 1);

            if (i < a.length / 2) {
                System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
            } else {
                System.out.println("역순 정렬을 마쳤습니다.");
            }
        }
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("배열 a의 모든 요소의 합계는 " + sumOf(x) + "입니다.");
    }
}
