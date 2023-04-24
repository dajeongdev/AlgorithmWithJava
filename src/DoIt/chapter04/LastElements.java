package DoIt.chapter04;

import java.util.Scanner;

// 원하는 개수만큼 값을 입력 받아 요소수가 N인 배열에 마지막 N개를 저장
public class LastElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 10;
        int[] a = new int[N]; // 입력 받은 값을 저장
        int count = 0;        // 입력 받은 개수
        int retry;            // 재시도

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수 : ", count + 1);
            a[count++ % N] = sc.nextInt();

            System.out.print("계속 할까요? (1:예, 0:아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);

        int i = count - N;
        if (i < 0) i = 0;

        for (; i < count; i++)
            System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);
    }
}
