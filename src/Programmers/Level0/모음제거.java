package Programmers.Level0;

public class 모음제거 {
    /**
     * 문제 설명
     * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * my_string은 소문자와 공백으로 이루어져 있습니다.
     * 1 ≤ my_string의 길이 ≤ 1,000
     * 입출력 예
     * my_string	result
     * "bus"	"bs"
     * "nice to meet you"	"nc t mt y"
     * 입출력 예 설명
     * 입출력 예 #1
     *
     * "bus"에서 모음 u를 제거한 "bs"를 return합니다.
     * 입출력 예 #1
     *
     * "nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
     */
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        모음제거 T = new 모음제거();

        System.out.println(T.solution("bus"));
        System.out.println(T.solution("nice to meet you"));
    }
}
