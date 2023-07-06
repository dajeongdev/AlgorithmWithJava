package Programmers.Level0_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수는싫어요 {
    /**
     * 문제 설명
     * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ n ≤ 100
     *
     * 입출력 예
     * n	result
     * 10	[1, 3, 5, 7, 9]
     * 15	[1, 3, 5, 7, 9, 11, 13, 15]
     *
     * 입출력 예 설명
     * 입출력 #1
     * 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
     * 입출력 #1
     * 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
     */
    public int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : (n / 2) + 1];

        int count = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[count] = i;
            count++;
        }
        return answer;
    }

    public int[] otherSolution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

    public static void main(String[] args) {
        짝수는싫어요 T = new 짝수는싫어요();

        System.out.println(Arrays.toString(T.solution(10)));
        System.out.println(Arrays.toString(T.solution(15)));
    }
}
