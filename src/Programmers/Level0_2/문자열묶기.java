package Programmers.Level0_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 문자열묶기 {
    /**
     * 문제 설명
     * 문자열 배열 strArr이 주어집니다.
     * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * 1 ≤ strArr의 길이 ≤ 100,000
     * 1 ≤ strArr의 원소의 길이 ≤ 30
     * strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
     *
     * 입출력 예
     * strArr	result
     * ["a","bc","d","efg","hi"]	2
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.
     * 문자열 길이	문자열 목록	개수
     * 1	["a","d"]	2
     * 2	["bc","hi"]	2
     * 3	["efg"]	1
     * 개수의 최댓값은 2이므로 2를 return 합니다.
     */
    public int solution(String[] strArr) {
        int[] answer = new int[strArr.length];
        for (int i = 0; i < answer.length; i++)
            answer[strArr[i].length()]++;
        return Arrays.stream(answer).max().getAsInt();
    }

    public int otherSolution(String[] strArr) {
        return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values()
                .stream().max(Comparator.comparingInt(List::size))
                .orElse(Collections.emptyList()).size();
    }

    public static void main(String[] args) {
        문자열묶기 T = new 문자열묶기();

        String[] strArr = {"a","bc","d","efg","hi"};
        System.out.println(T.solution(strArr));
        System.out.println(T.otherSolution(strArr));
    }
}
