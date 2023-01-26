package Programmers.Level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 잘라서배열로저장하기 {
    /**
     * 문제 설명
     * 문자열 my_str과 n이 매개변수로 주어질 때,
     * my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ my_str의 길이 ≤ 100
     * 1 ≤ n ≤ my_str의 길이
     * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
     *
     * 입출력 예
     * my_str	n	result
     * "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
     * "abcdef123"	3	["abc", "def", "123"]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * "abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.
     * 입출력 예 #2
     * "abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.
     *
     * 유의사항
     * 입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면 "abc1Ad", "dfggg4" 두 개와 마지막 "556b"가 남습니다.
     * 이런 경우 남은 문자열을 그대로 배열에 저장합니다.
     */
    public String[] solution(String my_str, int n) {
        int length = (my_str.length() + n - 1) / n;
        String[] answer = new String[length];
        for (int i = 0; i < length; i++) {
            int start = n * i;
            int end = start + n >= my_str.length() ? my_str.length() : start + n;
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }

    public String[] otherSolution(String myStr, int n) {
        return IntStream.range(0, myStr.length() / n + (myStr.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        잘라서배열로저장하기 T = new 잘라서배열로저장하기();

        System.out.println(Arrays.toString(T.solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(T.solution("abcdef123", 3)));
    }
}
