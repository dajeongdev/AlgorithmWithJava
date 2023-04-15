package DoIt.chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTesterAndQ6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요소수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: "); // 배열의 첫 요소를 먼저 입력한다.
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력한다.
        }

        System.out.print("검색할 값: "); // 키값을 입력받는다.
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key); // 배여 x에서 키값이 key인 요소를 검색한다.

        System.out.println(idx < 0 ?  // Q6. 검색에 실패하면 삽입 포인트의 값을 출력
                "그 값의 요소가 없습니다. (삽입 포인트 : " + idx + ")" : key + "은(는) x[" + idx + "]에 있습니다.");
    }
}
