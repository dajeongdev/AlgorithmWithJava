package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 비교, 교환 과정을 자세히 출력하면서 버블 정렬하는 프로그램을 작성하세요.
public class Q2 {

    // a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 교환 정렬
    static void bubbleSort(int[] a, int n) {
        int compared = 0;   // 비교
        int exchanged = 0;  // 교환

        for (int i = 0; i < n - 1; i++) {
            System.out.printf("패스%d : \n", i + 1);
            for (int j = n - 1; j > i; j--) { // 패스

                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c", a[m],
                            (m != j-1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
                System.out.printf("%3d\n", a[n - 1]);

                compared++;

                if (a[j - 1] > a[j]) {
                    exchanged++;
                    swap(a, j - 1, j);
                }
            }
            for (int m = 0; m < n; m++)
                System.out.printf("%3d  " , a[m]);
            System.out.println();
        }
        System.out.println("비교를 " + compared + "회 했습니다.");
        System.out.println("교환을 " + exchanged + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, n); // 배열 x를 버블 정렬합니다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
