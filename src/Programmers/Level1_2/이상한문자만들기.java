package Programmers.Level1_2;

public class 이상한문자만들기 {
    /**
     * 문제 설명
     * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
     * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
     * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
     *
     * 제한 사항
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
     *
     * 입출력 예
     * s	return
     * "try hello world"	"TrY HeLlO WoRlD"
     * 입출력 예 설명
     * "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
     */
    public String solution(String s) {
        String answer = "";
        int count = 0;

        for (String word : s.split("")) {
            count = word.contains(" ") ? 0 : ++count;
            answer += (count % 2 == 0) ? word.toLowerCase() : word.toUpperCase();
        }
        return answer;
    }

    public String otherSolution(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, count = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count = 0;
            } else {
                chars[i] = (++count % 2 == 0) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        이상한문자만들기 T = new 이상한문자만들기();

        System.out.println(T.solution("try hello world"));
        System.out.println(T.otherSolution("try hello world"));
    }
}
