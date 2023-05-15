package Programmers.beginner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class 날짜비교하기 {
    /**
     * 문제 설명
     * 정수 배열 date1과 date2가 주어집니다.
     * 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
     * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
     * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * date1의 길이 = date2의 길이 = 3
     * 0 ≤ year ≤ 10,000
     * 1 ≤ month ≤ 12
     * day는 month에 따라 가능한 날짜로 주어집니다.
     *
     * 입출력 예
     * date1	date2	result
     * [2021, 12, 28]	[2021, 12, 29]	1
     * [1024, 10, 24]	[1024, 10, 24]	0
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * date1이 date2보다 하루 앞서기 때문에 1을 return 합니다.
     * 입출력 예 #2
     * date1과 date2는 날짜가 서로 같으므로 date1이 더 앞서는 날짜가 아닙니다. 따라서 0을 return 합니다.
     */
    public int solution(int[] date1, int[] date2) {
        LocalDate l1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate l2 = LocalDate.of(date2[0], date2[1], date2[2]);
        return ChronoUnit.DAYS.between(l1, l2) > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        날짜비교하기 T = new 날짜비교하기();

        int[] date1_1 = {2021, 12, 28};
        int[] date1_2 = {1024, 10, 24};
        int[] date1_3 = {2021, 12, 31};
        int[] date1_4 = {2022, 03, 29};
        int[] date2_1 = {2021, 12, 29};
        int[] date2_2 = {1024, 10, 24};
        int[] date2_3 = {2022, 01, 01};
        int[] date2_4 = {2022, 04, 01};

        System.out.println(T.solution(date1_1, date2_1));
        System.out.println(T.solution(date1_2, date2_2));
        System.out.println(T.solution(date1_3, date2_3));
        System.out.println(T.solution(date1_4, date2_4));
    }
}
