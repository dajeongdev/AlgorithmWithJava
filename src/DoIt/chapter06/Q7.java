package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

/** 단순 삽입 정렬에서 배열의 첫번째 요소(a[0])부터 데이터를 저장하지 않고
 * a[1]부터 저장하면 a[0]을 보초로 하여 삽입을 마치는 조건을 줄일 수 있습니다.
 * 이 아이디어를 적용하여 단순 삽입 정렬 메서드를 수정하세요.
*/
public class Q7 {

    // 단순 삽입 정렬(보초법: 배열의 맨앞 요소는 비어 있음)
    static void insertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int tmp = a[0] = a[i];
            int j = i;
            for ( ; a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            if (j > 0) a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n + 1];      // 여분으로 1개 더 설정

        for (int i = 1; i <= n; i++) { // x[1] ~ x[n]에 입력 받음
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        insertionSort(x, n + 1);          // 배열 x를 단순 삽입 정렬합니다.

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 1; i <= n; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
