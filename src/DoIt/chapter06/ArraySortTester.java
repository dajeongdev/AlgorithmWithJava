package DoIt.chapter06;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.sort()를 사ㅏ용하여 정렬한다. (퀵 정렬)
public class ArraySortTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        Arrays.sort(x); // 배열 x를 정렬한다.

        System.out.println("오름차순으로 정렬하였습니다.");
        System.out.println(Arrays.toString(x));
    }
}
