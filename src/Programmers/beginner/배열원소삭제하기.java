package Programmers.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 배열원소삭제하기 {
    /**
     * 문제 설명
     * 정수 배열 arr과 delete_list가 있습니다.
     * arr의 원소 중 delete_list의 원소를 모두 삭제하고
     * 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 100
     * 1 ≤ arr의 원소 ≤ 1,000
     * arr의 원소는 모두 서로 다릅니다.
     * 1 ≤ delete_list의 길이 ≤ 100
     * 1 ≤ delete_list의 원소 ≤ 1,000
     * delete_list의 원소는 모두 서로 다릅니다.
     *
     * 입출력 예
     * arr	delete_list	result
     * [293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
     * [110, 66, 439, 785, 1]	[377, 823, 119, 43]	[110, 66, 439, 785, 1]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 예제 1번의 arr의 원소 중 1000과 94가 delete_list에 있으므로 이 두 원소를 삭제한 [293, 395, 678]을 return 합니다.
     * 입출력 예 #2
     * 예제 2번의 arr의 원소 중 delete_list에 있는 원소는 없습니다. 따라서 arr 그대로인 [110, 66, 439, 785, 1]을 return 합니다.
     */
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < delete_list.length; i++)
            if (list.contains(new Integer(delete_list[i]))) list.remove(new Integer(delete_list[i]));
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] otherSolution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }

    public static void main(String[] args) {
        배열원소삭제하기 T = new 배열원소삭제하기();

        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] arr2 = {110, 66, 439, 785, 1};
        int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
        int[] delete_list2 = {377, 823, 119, 43};

        System.out.println(Arrays.toString(T.solution(arr1, delete_list1)));
        System.out.println(Arrays.toString(T.solution(arr2, delete_list2)));
        System.out.println(Arrays.toString(T.otherSolution(arr1, delete_list1)));
        System.out.println(Arrays.toString(T.otherSolution(arr2, delete_list2)));
    }
}
