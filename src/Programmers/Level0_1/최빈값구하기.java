package Programmers.Level0_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {
    /**
     * 문제 설명
     * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
     * 정수 배열 array가 매개변수로 주어질 때,
     * 최빈값을 return 하도록 solution 함수를 완성해보세요.
     * 최빈값이 여러 개면 -1을 return 합니다.
     *
     * 제한사항
     * 0 < array의 길이 < 100
     * 0 ≤ array의 원소 < 1000
     *
     * 입출력 예
     * array	result
     * [1, 2, 3, 3, 3, 4]	3
     * [1, 1, 2, 2]	-1
     * [1]	1
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
     * 입출력 예 #2
     * [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
     * 입출력 예 #3
     * [1]에는 1만 있으므로 최빈값은 1입니다.
     */
    public int solution(int[] array) {
        Arrays.sort(array);
        int max = 1;
        int count = 1;
        int current = array[0];

        for (int i = 1; i < array.length; i++) {
            count = array[i] == array[i - 1] ? count + 1 : 1;
            if (count > max) {
                max = count;
                current = array[i];
            } else if (count == max) {
                current = -1;
            }
        }
        return current;
    }

    public int otherSolution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            } else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        최빈값구하기 T = new 최빈값구하기();

        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1, 2};

        System.out.println(T.solution(array1));
        System.out.println(T.solution(array2));
        System.out.println(T.solution(array3));
    }
}
