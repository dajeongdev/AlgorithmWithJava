package DoIt.chapter03;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {

    // 요소수가 n인 배열 a에서 key와 같은 요소를 선형 검색한다.
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        while (true) {
            if (i == n) return -1; // 검색 실패
            if (a[i] == key) return i; // 검색 성공 (인덱스 반환)
            i++;
        }
    }

    static int seqSearchFor(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) return i; // 검색 성공 (인덱스 반환)
        }
        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key);

        System.out.println((idx == -1) ?
                "해당 값의 요소가 없습니다." : key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
