package DoIt.chapter06;

import java.util.Scanner;

/**
 * 퀵 정렬은 요소의 개수가 적은 배열에 대해소는 처리가 아주 빠르게 진행되지 않는다고 알려져 있습니다.
 * Q12에서 작성한 두 quickSort 메서드를 나눈 그룹의 요소 개수가 9개 이하이면 단순 삽입 정렬로 동작하는 메서드로 수정하세요.
  */
public class Q13 {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 삽입 정렬
    static void insertionSort(int[] a, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int tmp = a[i];
            int j;
            for (j = i; j > left && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        if (right - left < 9) {
            insertionSort(a, left, right);
        } else {
            int pl = left;            // 왼쪽 커서
            int pr = right;           // 오른쪽 커서
            int x = a[(pl + pr) / 2]; // 피벗은 가운데 요소

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (pr - left < right - pl) {
                int temp;
                temp = left; left = pl; pl = temp;
                temp = right; right = pr; pr = temp;
            }

            if (left < pr) quickSort(a, left, pr);
            if (pl < right) quickSort(a, pl, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        quickSort(x, 0, n - 1); // 배열 x를 퀵 정렬합니다.

        System.out.println("오름차순으로 정렬합니다.");
        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
