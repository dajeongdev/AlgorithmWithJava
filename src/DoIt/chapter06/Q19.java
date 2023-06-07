package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 도수 정렬
public class Q19 {

    // 도수 정렬(배열의 요소값은 min 이상 max 이하)
    static void countingSort(int[] a, int n, int min, int max) {
        int[] f = new int[max - min + 2]; // 누적 도수
        int[] b = new int[n];             // 작업용 목적 배열

        for (int i = 0;     i < n;          i++) f[a[i]-min]++;           // 1단계
        for (int i = 1;     i <= max-min+1; i++) f[i] += f[i-1];          // 2단계
        for (int i = n - 1; i >= 0;         i--) b[--f[a[i]-min]] = a[i]; // 3단계
        for (int i = 0;     i < n;          i++) a[i] = b[i];             // 4단계
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

        int min = x[0];
        for (int i = 1; i < n; i++)
            if (x[i] < min) min = x[i];

        countingSort(x, n, min, max); // 배열 x를 도수 정렬한다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
