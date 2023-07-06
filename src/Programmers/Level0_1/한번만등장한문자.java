package Programmers.Level0_1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class 한번만등장한문자 {
    /**
     * 문제 설명
     * 문자열 s가 매개변수로 주어집니다.
     * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
     *
     * 제한사항
     * 0 < s의 길이 < 1,000
     * s는 소문자로만 이루어져 있습니다.
     *
     * 입출력 예
     * s	result
     * "abcabcadc"	"d"
     * "abdc"	"abcd"
     * "hello"	"eho"
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
     * 입출력 예 #2
     * "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
     * 입출력 예 #3
     * "hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
     */
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split);
        for (int i = 0; i < split.length; i++) {
            int count = 0;
            for (int j = 0; j < split.length; j++) {
                if (split[i].equals(split[j])) count++;
            }
            if (count == 1) answer += split[i];
        }
        return answer;
    }

    public String otherSolution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        한번만등장한문자 T = new 한번만등장한문자();

        System.out.println(T.solution("abcabcadc"));
        System.out.println(T.solution("abdc"));
        System.out.println(T.solution("hello"));
    }
}
