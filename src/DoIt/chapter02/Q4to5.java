package DoIt.chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4to5 {

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) b[i] = a[i];
        System.out.println(Arrays.toString(b));
    }

    static void reverseCopy(int[] a, int[] b) {
        for (int i = 0, temp = a.length - 1; i < a.length; i++) b[i] = a[temp--];
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요소수: ");
        int na = sc.nextInt();
        int[] a = new int[na];
        for (int i = 0; i < na; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }


        int[] b = new int[na];
        copy(a, b);
        reverseCopy(a, b);
    }
}
