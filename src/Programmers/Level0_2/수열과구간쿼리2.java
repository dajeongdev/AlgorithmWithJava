package Programmers.Level0_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 수열과구간쿼리2 {
    /**
     * 문제 설명
     * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
     * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
     * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
     * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
     * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 1,000
     * 0 ≤ arr의 원소 ≤ 1,000,000
     * 1 ≤ queries의 길이 ≤ 1,000
     * 0 ≤ s ≤ e < arr의 길이
     * 0 ≤ k ≤ 1,000,000
     *
     * 입출력 예
     * arr	queries	result
     * [0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
     * 두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
     * 세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
     * 따라서 [3, 4, -1]을 return 합니다.
     */
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];

            ArrayList<Integer> list = new ArrayList<>();
            for (int j = s; j <= e; j++)
                if (arr[j] > k)
                    list.add(arr[j]);

            if (!list.isEmpty()) {
                Collections.sort(list);
                answer[i] = list.get(0);
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }

    public int[] otherSolution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0], e = query[1], k = query[2];

            for (int j = s; j <= e; j++)
                if (arr[j] > k)
                    answer[i] = answer[i] == -1 ? arr[j] : Math.min(answer[i], arr[j]);
        }
        return answer;
    }

    public static void main(String[] args) {
        수열과구간쿼리2 T = new 수열과구간쿼리2();

        int[] arr1 = {0, 1, 2, 4, 3};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int[][] queries1 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[][] queries2 = {{2, 4, 5},{0, 3, 1},{2, 3, 2}};
        int[][] queries3 = {{0, 2, 10},{0, 2, 3}};

        System.out.println(Arrays.toString(T.solution(arr1, queries1)));
        System.out.println(Arrays.toString(T.solution(arr2, queries2)));
        System.out.println(Arrays.toString(T.solution(arr3, queries3)));
        System.out.println(Arrays.toString(T.otherSolution(arr1, queries1)));
        System.out.println(Arrays.toString(T.otherSolution(arr2, queries2)));
        System.out.println(Arrays.toString(T.otherSolution(arr3, queries3)));
    }
}
