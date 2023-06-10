package Programmers.Level1_1;

import java.util.*;
import java.util.stream.Collectors;

public class 두개뽑아서더하기 {
    /**
     * [문제 설명]
     * 정수 배열 numbers가 주어집니다.
     * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     *
     * [제한사항]
     * numbers의 길이는 2 이상 100 이하입니다.
     * numbers의 모든 수는 0 이상 100 이하입니다.
     *
     * [입출력 예]
     * numbers	result
     * [2,1,3,4,1]	[2,3,4,5,6,7]
     * [5,0,2,7]	[2,5,7,9,12]
     *
     * [입출력 예 설명]
     * 입출력 예 #1
     * 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
     * 3 = 2 + 1 입니다.
     * 4 = 1 + 3 입니다.
     * 5 = 1 + 4 = 2 + 3 입니다.
     * 6 = 2 + 4 입니다.
     * 7 = 3 + 4 입니다.
     * 따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
     *
     * 입출력 예 #2
     * 2 = 0 + 2 입니다.
     * 5 = 5 + 0 입니다.
     * 7 = 0 + 7 = 5 + 2 입니다.
     * 9 = 2 + 7 입니다.
     * 12 = 5 + 7 입니다.
     * 따라서 [2,5,7,9,12] 를 return 해야 합니다.
     */
    public int[] solution(int[] numbers) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int length = numbers.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        list = list.stream().distinct().sorted().collect(Collectors.toList());

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        두개뽑아서더하기 T = new 두개뽑아서더하기();
        int[] arr1 = {2,1,3,4,1};
        int[] arr2 = {5,0,2,7};

        System.out.println(Arrays.toString(T.otherSolution2(arr1)));
        System.out.println(Arrays.toString(T.otherSolution2(arr2)));
    }

    /** 다른 풀이 **/
    /** TreeSet을 사용하면 중복도 제거되고, 오름차순으로 정렬하지 않아도 됨 */
    public int[] otherSolution1(int[] numbers) {
        Set<Integer> integerSet = new TreeSet<>();

        for(int i = 0; i < numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                integerSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[integerSet.size()];
        int size = 0;
        for (int num : integerSet) {
            answer[size++] = num;
        }

        return answer;
    }

    /** 가독성은 좋지만 속도는 느림 */
    public int[] otherSolution2(int[] numbers) {
        Set<Integer> integerSet = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                integerSet.add(numbers[i] + numbers[j]);
            }
        }

        return integerSet.stream().sorted().mapToInt(i -> i).toArray();
    }
}
