package Programmers.Level2;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class 튜플 {
    /**
     *문제 설명
     * 셀수있는 수량의 순서있는 열거 또는 어떤 순서를 따르는 요소들의 모음을 튜플(tuple)이라고 합니다.
     * n개의 요소를 가진 튜플을 n-튜플(n-tuple)이라고 하며, 다음과 같이 표현할 수 있습니다.
     *
     * (a1, a2, a3, ..., an)
     * 튜플은 다음과 같은 성질을 가지고 있습니다.
     *
     * 중복된 원소가 있을 수 있습니다. ex : (2, 3, 1, 2)
     * 원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플입니다. ex : (1, 2, 3) ≠ (1, 3, 2)
     * 튜플의 원소 개수는 유한합니다.
     *
     * 원소의 개수가 n개이고, 중복되는 원소가 없는 튜플 (a1, a2, a3, ..., an)이 주어질 때(단, a1, a2, ..., an은 자연수),
     * 이는 다음과 같이 집합 기호 '{', '}'를 이용해 표현할 수 있습니다.
     *
     * {{a1}, {a1, a2}, {a1, a2, a3}, {a1, a2, a3, a4}, ... {a1, a2, a3, a4, ..., an}}
     * 예를 들어 튜플이 (2, 1, 3, 4)인 경우 이는
     * {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
     * 와 같이 표현할 수 있습니다. 이때, 집합은 원소의 순서가 바뀌어도 상관없으므로
     *
     * {{2}, {2, 1}, {2, 1, 3}, {2, 1, 3, 4}}
     * {{2, 1, 3, 4}, {2}, {2, 1, 3}, {2, 1}}
     * {{1, 2, 3}, {2, 1}, {1, 2, 4, 3}, {2}}
     * 는 모두 같은 튜플 (2, 1, 3, 4)를 나타냅니다.
     *
     * 특정 튜플을 표현하는 집합이 담긴 문자열 s가 매개변수로 주어질 때,
     * s가 표현하는 튜플을 배열에 담아 return 하도록 solution 함수를 완성해주세요.
     *
     * [제한사항]
     * s의 길이는 5 이상 1,000,000 이하입니다.
     * s는 숫자와 '{', '}', ',' 로만 이루어져 있습니다.
     * 숫자가 0으로 시작하는 경우는 없습니다.
     * s는 항상 중복되는 원소가 없는 튜플을 올바르게 표현하고 있습니다.
     * s가 표현하는 튜플의 원소는 1 이상 100,000 이하인 자연수입니다.
     * return 하는 배열의 길이가 1 이상 500 이하인 경우만 입력으로 주어집니다.
     *
     * [입출력 예]
     * s	result
     * "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
     * "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
     * "{{20,111},{111}}"	[111, 20]
     * "{{123}}"	[123]
     * "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]
     *
     * 입출력 예에 대한 설명
     * 입출력 예 #1
     * 문제 예시와 같습니다.
     *
     * 입출력 예 #2
     * 문제 예시와 같습니다.
     *
     * 입출력 예 #3
     * (111, 20)을 집합 기호를 이용해 표현하면 {{111}, {111,20}}이 되며, 이는 {{20,111},{111}}과 같습니다.
     *
     * 입출력 예 #4
     * (123)을 집합 기호를 이용해 표현하면 {{123}} 입니다.
     *
     * 입출력 예 #5
     * (3, 2, 4, 1)을 집합 기호를 이용해 표현하면 {{3},{3,2},{3,2,4},{3,2,4,1}}이 되며, 이는 {{4,2,3},{3},{2,3,4,1},{2,3}}과 같습니다.
     */
    public int[] solution(String s) {
        String[] groups = Pattern.compile("\\{(.*?)}")
                .matcher(s.substring(1, s.length() - 1))
                .results()
                .map(MatchResult::group)
                .toArray(String[]::new);
        Arrays.sort(groups, Comparator.comparingInt(String::length));

        ArrayList<Integer> answer = new ArrayList<>();
        for (String group : groups) {
            group = group.substring(1, group.length() - 1);
            String[] numbers = group.split(",");

            for (String num : numbers) {
                int number = Integer.parseInt(num);
                if (!answer.contains(number)) answer.add(number);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        튜플 T = new 튜플();

        System.out.println(Arrays.toString(T.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(T.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(T.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(T.solution("{{123}}")));
        System.out.println(Arrays.toString(T.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }

    public int[] otherSolution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
