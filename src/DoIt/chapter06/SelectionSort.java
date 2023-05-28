package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 단순 선택 정렬
public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 선택 정렬
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;      // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록한다.
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환한다.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        selectionSort(x, n); // 배열 x를 단순 선택 정렬합니다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
