package Programmers.Level0;

import java.util.stream.Collectors;

public class 대문자와소문자 {
    /**
     * 문제 설명
     * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 1,000
     * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
     *
     * 입출력 예
     * my_string	result
     * "cccCCC"	"CCCccc"
     * "abCdEfghIJ"	"ABcDeFGHij"
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
     * 입출력 예 #2
     * 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
     */
    public String solution(String my_string) {
        String answer = "";
        for (char letter :  my_string.toCharArray()) {
            answer += Character.isUpperCase(letter) ? Character.toLowerCase(letter) : Character.toUpperCase(letter);
        }
        return answer;
    }

    public String otherSolution(String my_string) {
        return my_string.chars().mapToObj(letter ->
                String.valueOf((char) (Character.isUpperCase(letter) ?
                        Character.toLowerCase(letter) : Character.toUpperCase(letter))))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        대문자와소문자 T = new 대문자와소문자();

        System.out.println(T.solution("cccCCC"));
        System.out.println(T.solution("abCdEfghIJ"));
        System.out.println(T.otherSolution("cccCCC"));
        System.out.println(T.otherSolution("abCdEfghIJ"));
    }
}
