package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// Bidirection Bubble Sort == Cocktail Sort == Shaker Sort

/**
 * [9, 1, 3, 4, 6, 7, 8]의 경우
 * 두 번째 요소부터는 정렬되어있지만, 버전 3의 버블 정렬을 사용해도 빠른 시간 안에 정렬 작업을 마칠 수 없다.
 * 왜냐하면 맨 앞의 요소의 값(9)은 1회의 패스를 거쳐도 한 칸씩만 뒤로 옮겨지기 때문이다.
 * 그래서 홀수 번째의 패스는 가장 작은 요소를 맨 앞으로 옮기고,
 * 짝수 번째의 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용하면
 * (==패스의 스캔 방향을 교대로 바꾸면)
 * 이런 정렬을 더 적은 횟수로 비교할 수 있다.
 */
public class Q5 {

    // a[idx1]와 a[idx2]의 값을 바꿉니다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 양방향 버블 정렬(셰이커 정렬)
    static void bubbleSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int last = right;

        while (left < right) {
            for (int j = right; j > left; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            left = last;

            for (int j = left; j < right; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
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
