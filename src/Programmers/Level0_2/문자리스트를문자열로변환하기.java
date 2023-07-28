package Programmers.Level0_2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자리스트를문자열로변환하기 {
    /**
     * 문제 설명
     * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 200
     * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
     * 입출력 예
     * arr	result
     * ["a","b","c"]	"abc"
     */
    public String solution(String[] arr) {
        String answer = "";
        for (String s : arr)
            answer += s;
        return answer;
    }

    public String otherSolution1(String[] arr) {
        return String.join("", arr);
    }

    public String otherSolution2(String[] arr) {
        return Arrays.stream(arr).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        문자리스트를문자열로변환하기 T = new 문자리스트를문자열로변환하기();

        String[] arr = {"a","b","c"};
        System.out.println(T.solution(arr));
        System.out.println(T.otherSolution1(arr));
        System.out.println(T.otherSolution2(arr));
    }
}
