package Programmers.Level0_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 진료순서정하기 {
    /**
     * 문제 설명
     * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
     * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 중복된 원소는 없습니다.
     * 1 ≤ emergency의 길이 ≤ 10
     * 1 ≤ emergency의 원소 ≤ 100
     *
     * 입출력 예
     * emergency	result
     * [3, 76, 24]	[3, 1, 2]
     * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
     * [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * emergency가 [3, 76, 24]이므로 응급도의 크기 순서대로 번호를 매긴 [3, 1, 2]를 return합니다.
     * 입출력 예 #2
     * emergency가 [1, 2, 3, 4, 5, 6, 7]이므로 응급도의 크기 순서대로 번호를 매긴 [7, 6, 5, 4, 3, 2, 1]를 return합니다.
     * 입출력 예 #3
     * emergency가 [30, 10, 23, 6, 100]이므로 응급도의 크기 순서대로 번호를 매긴 [2, 4, 3, 5, 1]를 return합니다.
     */
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int num = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (i != j && emergency[i] < emergency[j]) num++;
            }
            answer[i] = num;
        }
        return answer;
    }

    public int[] otherSolution(int[] e) {
        return Arrays.stream(e).map(
                i -> Arrays.stream(e).boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(i) + 1)
                .toArray();
    }

    public static void main(String[] args) {
        진료순서정하기 T = new 진료순서정하기();

        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        System.out.println(Arrays.toString(T.solution(emergency1)));
        System.out.println(Arrays.toString(T.solution(emergency2)));
        System.out.println(Arrays.toString(T.solution(emergency3)));
    }
}