package Programmers.Level0_2;

import java.util.stream.Collectors;

public class l로만들기 {
    /**
     * 문제 설명
     * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
     * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * 1 ≤ myString ≤ 100,000
     * myString은 알파벳 소문자로 이루어진 문자열입니다.
     *
     * 입출력 예
     * myString	result
     * "abcdevwxyz"	"lllllvwxyz"
     * "jjnnllkkmm"	"llnnllllmm"
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 0 ~ 4번 인덱스의 문자 "a","b","c","d","e"는 각각 "l"보다 앞서는 문자입니다. 따라서 "l"로 고쳐줍니다.
     * 그 외의 문자는 모두 "l"보다 앞서지 않는 문자입니다. 따라서 바꾸지 않습니다.
     * 따라서 "lllllvwxyz"을 return 합니다.
     * 입출력 예 #2
     * 0번, 1번, 6번, 7번 인덱스의 문자 "j","j","k","k"는 각각 "l"보다 앞서는 문자입니다. 따라서 "l"로 고쳐줍니다.
     * 그 외의 문자는 모두 "l"보다 앞서지 않는 문자입니다. 따라서 바꾸지 않습니다.
     * 따라서 "llnnllllmm"을 return 합니다.
     */
    public String solution(String myString) {
        // l의 아스키코드 10진수는 108
        return myString.chars()
                .mapToObj(c -> Character.toString(Integer.max(c, 'l')))
                .collect(Collectors.joining());
    }

    public String otherSolution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }

    public static void main(String[] args) {
        l로만들기 T = new l로만들기();

        System.out.println(T.solution("abcdevwxyz"));
        System.out.println(T.solution("jjnnllkkmm"));
        System.out.println(T.otherSolution("abcdevwxyz"));
        System.out.println(T.otherSolution("jjnnllkkmm"));
    }
}
