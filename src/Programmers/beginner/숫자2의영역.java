package Programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 숫자2의영역 {
    /**
     * 문제 설명
     * 정수 배열 arr가 주어집니다.
     * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
     * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 100,000
     * 1 ≤ arr의 원소 ≤ 10
     *
     * 입출력 예
     * arr	result
     * [1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
     * [1, 2, 1]	[2]
     * [1, 1, 1]	[-1]
     * [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
     * 입출력 예 #2
     * 2가 한 개뿐이므로 [2]를 return 합니다.
     * 입출력 예 #3
     * 2가 배열에 없으므로 [-1]을 return 합니다.
     * 입출력 예 #4
     * 2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
     */
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 2) list.add(i);
        return (list.size() > 0) ? Arrays.copyOfRange(arr, list.get(0), (list.get(list.size() - 1)) + 1) : new int[]{-1};
    }

    public int[] otherSolution(int[] arr) {
        int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        if (idx.length == 0) return new int[]{-1};
        return IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
    }

    public static void main(String[] args) {
        숫자2의영역 T = new 숫자2의영역();

        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};

        System.out.println(Arrays.toString(T.solution(arr1)));
        System.out.println(Arrays.toString(T.solution(arr2)));
        System.out.println(Arrays.toString(T.solution(arr3)));
        System.out.println(Arrays.toString(T.solution(arr4)));
        System.out.println(Arrays.toString(T.otherSolution(arr1)));
        System.out.println(Arrays.toString(T.otherSolution(arr2)));
        System.out.println(Arrays.toString(T.otherSolution(arr3)));
        System.out.println(Arrays.toString(T.otherSolution(arr4)));
    }
}
