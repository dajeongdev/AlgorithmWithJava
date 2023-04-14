package DoIt.chapter03;

import java.util.Scanner;

// 선형 검색(보초법)
public class SeqSearchSenAndQ1 {

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초 추가

        while (true) {
            if (a[i] == key) break; // 검색 성공
            i++;
        }

        // Q1 for (; ; i++) if (a[i] == key) break;

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();
        int[] x =  new int[num + 1]; // 요소수 num + 1(보초)

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = seqSearchSen(x, num, key);

        System.out.println(idx == -1 ?
                "그 값의 요소가 없습니다." : key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
