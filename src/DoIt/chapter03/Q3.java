package DoIt.chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    // 요소수가 n인 배열에서 key와 일치하는 모든 요소의 인덱스를
    // 배열 idx의 맨 앞부터 순서대로 저장하고, 일치한 요소수를 반환하는 메서드를 작성하세요.
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        ArrayList<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) idxList.add(a[i]);
        }
        idx = idxList.stream().mapToInt(Integer::intValue).toArray();
        return idx.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요소수가 num인 배열

        System.out.print("x[0]: "); // 첫 요소 입력
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: "); // 키 값 입력
        int key = sc.nextInt();

        int[] idx = new int[num];
        System.out.println("일치한 요소수: " + searchIdx(x, num, key, idx));
    }
}
