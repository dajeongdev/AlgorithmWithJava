package DoIt.chapter06;

import java.util.Scanner;

/**
 * 요소의 이동 횟수를 계산할 수 있도록 버전 1과 버전 2를 수정한 프로그램을 작성하세요.
 * 여러 가지 배열을 입력하고 프로그램을 실행하여 이동 횟수를 비교해 보세요.
 */
public class Q9 {

    // 셸 정렬(요소의 이동 횟수를 반환)
    static int shellSort1(int[] a, int n) {
        int count = 0; // 이동 횟수
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    count++;
                }
                a[j + h] = tmp;
                count++;
            }
        return count;
    }

    static int shellSort2(int[] a, int n) {
        int count = 0; // 이동 횟수

        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1); // h의 초기값 구하기

        for ( ; h > 0; h /= 3)
            for (int i = h; i < n; i++){
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    count++;
                }
                a[j + h] = tmp;
                count++;
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬 이동 횟수 카운트");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        int count1 = shellSort1(x, n); // 배열 x를 셸 정렬합니다.
        int count2 = shellSort2(x, n); // 배열 x를 셸 정렬합니다.

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "] = " + x[i]);

        System.out.println("셸 정렬1의 요소 이동 횟수는 " + count1 + "입니다.");
        System.out.println("셸 정렬2의 요소 이동 횟수는 " + count2 + "입니다.");
    }
}
