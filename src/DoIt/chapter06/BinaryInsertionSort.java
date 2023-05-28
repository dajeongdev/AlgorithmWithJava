package DoIt.chapter06;

import java.util.Scanner;

/**
 * 단순 삽입 정렬 배열의 요소수가 많아지면 많아질 수록
 * 요소 삽입에 필요한 비교, 대입 비용이 무시할 수 없을 정도로 커집니다.
 * 이때 배열에서 이미 정렬된 부분은 이진 검색을 사용할 수 있기 때문에 삽입할 위치를 더 빨리 찾을 수 있습니다.
 * 이진 검색을 사용하여 프로그램을 수정하세요.
 */
// 이진 삽입 정렬(안정적이지 않음)
public class BinaryInsertionSort {

    // 이진 삽입 정렬
    static void binInsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int pl = 0;      // 검색 범위 맨 앞의 인덱스
            int pr = i - 1;  // 검색 범위 맨 끝의 인덱스
            int pc;          // 검색 범위 중앙의 인덱스
            int pd;          // 삽입한느 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key) // 검색 성공
                    break;
                else if (a[pc] < key)
                    pl = pc + 1;
                else
                    pr = pc - 1;
            } while (pl <= pr);
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--)
                a[j] = a[j - 1];
            a[pd] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이진 삽입 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        binInsertionSort(x, n); // 배열 x를 이진 삽입 정렬합니다.

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
