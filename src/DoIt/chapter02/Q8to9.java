package DoIt.chapter02;

import java.util.Scanner;

public class Q8to9 {

    // 각 달의 일수
    static int[][] mdays ={
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
    };

    // 서기 year년은 윤년인가? (윤년: 1 / 평년: 0)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과일 수를 구함
    // Q8. 변수 i와 days 없이 while문을 사용하여 구현하기
    static int dayOfYear(int y, int m, int d) {
        while (m > 1) {
            d += mdays[isLeap(y)][--m];
        }
        return d;
    }

    // Q9. 남은 일 수 구하기
    static int leftDayOfYear(int y, int m, int d) {
        return isLeap(y) == 0 ? 365 - dayOfYear(y, m, d) : 366 - dayOfYear(y, m, d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        do {
            System.out.print("연: ");
            int year = sc.nextInt();

            System.out.print("월: ");
            int month = sc.nextInt();

            System.out.print("일: ");
            int day = sc.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            System.out.printf("그 해는 %d일 남았습니다.\n", leftDayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오): ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
