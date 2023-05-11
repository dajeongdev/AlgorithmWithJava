package Programmers.beginner;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 순서바꾸기 {
    /**
     * 문제 설명
     * 정수 리스트 num_list와 정수 n이 주어질 때,
     * num_list를 n 번째 원소 이후의 원소들과
     * n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 2 ≤ num_list의 길이 ≤ 30
     * 1 ≤ num_list의 원소 ≤ 9
     * 1 ≤ n ≤ num_list의 길이
     *
     * 입출력 예
     * num_list	n	result
     * [2, 1, 6]	1	[1, 6, 2]
     * [5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * [2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.
     * 입출력 예 #2
     * [5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.
     */
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        for (int i = 0, j = n; i < length - n; i++)
            answer[i] = num_list[j++];
        for (int i = length - n, j = 0; i < length; i++)
            answer[i] = num_list[j++];
        return answer;
    }

    public int[] otherSolution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }

    public static void main(String[] args) {
        순서바꾸기 T = new 순서바꾸기();

        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println(Arrays.toString(T.solution(num_list1, 1)));
        System.out.println(Arrays.toString(T.solution(num_list2, 3)));
        System.out.println(Arrays.toString(T.otherSolution(num_list1, 1)));
        System.out.println(Arrays.toString(T.otherSolution(num_list2, 3)));
    }
}
