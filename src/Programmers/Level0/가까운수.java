package Programmers.Level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 가까운수 {
    /**
     * 문제 설명
     * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
     * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ array의 길이 ≤ 100
     * 1 ≤ array의 원소 ≤ 100
     * 1 ≤ n ≤ 100
     * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
     *
     * 입출력 예
     * array	n	result
     * [3, 10, 28]	20	28
     * [10, 11, 12]	13	12
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 3, 10, 28 중 20과 가장 가까운 수는 28입니다.
     * 입출력 예 #2
     * 10, 11, 12 중 13과 가장 가까운 수는 12입니다.
     */
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n) {
                continue;
            } else {
                int a = n - array[i - 1];
                int b = array[i] - n;

                if (a > b) {
                    return array[i];
                } else if (a < b || a == b) {
                    return array[i - 1];
                }
            }
        }
        return array[array.length - 1];
    }

    public int otherSolution(int[] array, int n) {
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n - array[0]) > Math.abs(n - array[i])){
                array[0] = array[i];
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        가까운수 T = new 가까운수();

        int[] array1 = {3, 10, 28};
        int[] array2 = {10, 11, 12, 14};

        System.out.println(T.solution(array1, 20));
        System.out.println(T.solution(array2, 13));

        System.out.println(T.otherSolution(array1, 20));
        System.out.println(T.otherSolution(array2, 13));
    }
}
