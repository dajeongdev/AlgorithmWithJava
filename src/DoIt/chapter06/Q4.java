package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 버블 정렬(버전 3)을 비교, 교환 과정을 자세히 출력하는 프로그램을 작성하세요.
public class Q4 {

    // a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        int compared = 0;   // 비교
        int exchanged = 0;  // 교환

        int i = 0;
        int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            System.out.printf("패스%d : \n", ++i);
            int last = n - 1; // 마지막으로 요소를 교환한 위치

            for (int j = n - 1; j > k; j--) {
                for (int m = 0; m < n - 1; m++)
                    System.out.printf("%3d %c", a[m],
                            (m != j-1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
                System.out.printf("%3d\n", a[n - 1]);

                compared++;

                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                    exchanged++;
                }
            }
            k = last;
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
