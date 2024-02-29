package Programmers.Level1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
    /**
     * 문제 설명
     * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
     * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
     * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
     *
     * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
     * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
     * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * 배열 arr의 크기 : 1,000,000 이하의 자연수
     * 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
     *
     * 입출력 예
     * arr	answer
     * [1,1,3,3,0,1,1]	[1,3,0,1]
     * [4,4,4,3,3]	[4,3]
     *
     * 입출력 예 설명
     * 입출력 예 #1,2
     * 문제의 예시와 같습니다.
     */
    public int[] firstSolution(int[] arr) {
        Stack<Integer> answer = new Stack<>();
        for (int i = 1; i < arr.length - 1; i++) { // 길이 문제*** arr.length로 해야 arr 끝까지 확인함
            if (answer.peek() == arr[i]) {
                continue;
            }
            answer.add(arr[i]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    // final answer
    public int[] secondSolution(int[] arr) {
        Stack<Integer> answer = new Stack<>();
        for (int num : arr) {
            if (answer.isEmpty()|| answer.peek() != num) {
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public int[] otherSolution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int prev = 10; // 이전값 저장
        for (int num : arr) {
            if (prev != num) {
                answer.add(num);
            }
            prev = num;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        같은숫자는싫어 T = new 같은숫자는싫어();

        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

//        System.out.println(Arrays.toString(T.firstSolution(arr1)));
//        System.out.println(Arrays.toString(T.firstSolution(arr2)));
//        System.out.println(Arrays.toString(T.secondSolution(arr1)));
//        System.out.println(Arrays.toString(T.secondSolution(arr2)));

        System.out.println(Arrays.toString(T.otherSolution(arr1)));
        System.out.println(Arrays.toString(T.otherSolution(arr2)));
    }
}
