package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 버블 정렬의 각 패스에서 처음(왼쪽)부터 비교, 교환을 수행하는 프로그램을 작성하세요.
public class Q1 {

    // a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬 (왼쪽부터 비교)
    static void bubbleSort(int[] a, int n) {
        for (int i = n - 1; i > 0; i--)
            for (int j = 0; j < i; j++) // 맨앞 -> 맨끝 순서로 스캔
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
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
