package DoIt.chapter06;

import java.util.Scanner;

public class QuickSort2 {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵 정렬 (비재귀 버전)
    static void quickSort(int[] a, int left, int right) {
        IntStack lStack = new IntStack(right - left + 1); // 스택 생성
        IntStack rStack = new IntStack(right - left + 1); // 스택 생성

        lStack.push(left);
        rStack.push(right);

        while (lStack.isEmpty() != true) {
            int pl = left = lStack.pop();  // 왼쪽 커서
            int pr = right = rStack.pop(); // 오른쪽 커서
            int x = a[(left + right) / 2]; // 피벗

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lStack.push(left); // 왼쪽 그룹의 범위의
                rStack.push(pr);   // 인덱스를 푸시한다.
            }
            if (pl < right) {
                lStack.push(pl);    // 오른쪽 그룹 범위의
                rStack.push(right); // 인덱스를 푸시한다.
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("퀵 정렬(비재귀 버전)");
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
