package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 버블 정렬(버전 2)
public class BubbleSort2 {

    // a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchanged = 0; // 패스의 교환 횟수를 기록합니다.
            for (int j = n - 1; j > i; j--) // 패스
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchanged++;
                }
            if (exchanged == 0) break; // 교환이 이루어지지 않으면 종료합니다.
        }
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
