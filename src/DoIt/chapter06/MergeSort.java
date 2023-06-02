package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 병합 정렬
public class MergeSort {

    static int[] buff; // 작업용 배열

    // a[left] ~ a[right]를 재귀적으로 병합 정렬
    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0, j = 0, k = left;

            __mergeSort(a, left, center);           // 배열의 앞부분을 병합 정렬한다.
            __mergeSort(a, center + 1, right); // 배열의 뒷부분을 병합 정렬한다.

            for (i = left; i <= center; i++)
                buff[p++] = a[i];

            while (i <= right && j < p)
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

            while (j < p)
                a[k++] = buff[j++];
        }
    }

    // 병합 정렬
    static void mergeSort(int[] a, int n) {
        buff = new int[n]; // 작업용 배열을 생성한다.
        __mergeSort(a, 0, n - 1); // 배열 전체를 병합 정렬한다.
        buff = null; // 작업용 배열을 해제한다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("병합 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        mergeSort(x, n); // 배열 x를 벙합 정렬한다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}