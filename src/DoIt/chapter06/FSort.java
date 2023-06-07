package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 도수 정렬
public class FSort {

    // 도수 정렬(0 이상 max 이하의 값을 입력한다)
    static void fSort(int[] a, int n, int max) {
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[n];       // 작업용 목적 배열

        for (int i = 0; i < n; i++) f[a[i]]++;                // 1단계
        for (int i = 1; i <= max; i++) f[i] += f[i-1];        // 2단계
        for (int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i]; // 3단계
        for (int i = 0; i < n; i++) a[i] = b[i];              // 4단계
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("도수 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("x[" + i + "] = ");
                x[i] = sc.nextInt();
            } while (x[i] < 0);
        }

        int max = x[0];
        for (int i = 1; i < n; i++) // 배열 x의 최댓값을 구하여 max에 대입함
            if (x[i] > max) max = x[i];

        fSort(x, n, max);

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
