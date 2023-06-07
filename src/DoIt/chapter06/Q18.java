package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// 도수 정렬
public class Q18 {

    // 도수 정렬(배열의 요소값은 0 이상 max 이하)
    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max + 1]; // 누적 도수
        int[] b = new int[n];       // 작업용 목적 배열

        System.out.println("Step 1 : 도수분포표 작성");
        for (int i = 0; i < n; i++) { // 1단계
            for (int k = 0; k <= max; k++)
                System.out.printf("%3d", f[k]);
            System.out.println();
            f[a[i]]++;
        }
        for (int k = 0; k <= max; k++)
            System.out.printf("%3d", f[k]);
        System.out.println();

        System.out.println("Step 2 : 누적도수분포표 작성");
        for (int i = 1; i <= max; i++) { // 2단계
            for (int k = 0; k <= max; k++)
                System.out.printf("%3d", f[k]);
            System.out.println();
            f[i] += f[i-1];
        }
        for (int k = 0; k <= max; k++)
            System.out.printf("%3d", f[k]);
        System.out.println();

        System.out.println("Step 3 : 정렬");
        for (int i = n - 1; i >= 0; i--) { // 3단계
            for (int k = 0; k < n; k++)
                System.out.printf("%3d", b[k]);
            System.out.println();
            b[--f[a[i]]] = a[i];
        }
        for (int k = 0; k < n; k++)
            System.out.printf("%3d", b[k]);
        System.out.println();

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

        countingSort(x, n, max); // 배열 x를 도수 정렬한다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
