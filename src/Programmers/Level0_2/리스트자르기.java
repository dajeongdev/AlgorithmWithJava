package Programmers.Level0_2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 리스트자르기 {
    /**
     * 문제 설명
     * 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
     * slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
     *
     * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
     * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
     * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
     * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
     * 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * n 은 1, 2, 3, 4 중 하나입니다.
     * slicer의 길이 = 3
     * slicer에 담긴 정수를 차례대로 a, b, c라고 할 때
     * 0 ≤ a ≤ b ≤ num_list의 길이 - 1
     * 1 ≤ c ≤ 3
     * 5 ≤ num_list의 길이 ≤ 30
     * 0 ≤ num_list의 원소 ≤ 100
     *
     * 입출력 예
     * n	slicer	num_list	result
     * 3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
     * 4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * [1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 자른 리스트는 [2, 3, 4, 5, 6]입니다.
     * 입출력 예 #2
     * [1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 2개 간격으로 자른 리스트는 [2, 4, 6]입니다.
     */
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0], b = slicer[1] + 1, c = slicer[2];
        if (n == 1) {
            answer = Arrays.copyOfRange(num_list, 0, b);
        } else if (n == 2) {
            answer = Arrays.copyOfRange(num_list, a, num_list.length - 1);
        } else if (n == 3) {
            answer = Arrays.copyOfRange(num_list, a, b);
        } else if (n == 4){
            answer = IntStream.range(0, (b - a) / c+1).map(i -> num_list[a + i * c]).toArray();
        }
        return answer;
    }

    public static void main(String[] args) {
        리스트자르기 T = new 리스트자르기();

        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(T.solution(1, slicer, num_list)));
        System.out.println(Arrays.toString(T.solution(2, slicer, num_list)));
        System.out.println(Arrays.toString(T.solution(3, slicer, num_list)));
        System.out.println(Arrays.toString(T.solution(4, slicer, num_list)));
    }
}
