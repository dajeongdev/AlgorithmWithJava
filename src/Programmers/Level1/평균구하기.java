package Programmers.Level1;

import java.util.Arrays;

public class 평균구하기 {

    /**
     * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     * [제한사항]
     * arr은 길이 1 이상, 100 이하인 배열입니다.
     * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
     */

    public static double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer / arr.length;
    }

    /**
     * 참고할만한 답변
     * */
    public int otherAnswer1(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }

    public int otherAnswer2(int[] array) {
        return java.util.stream.IntStream.of(array).sum() / array.length;
    }
}
