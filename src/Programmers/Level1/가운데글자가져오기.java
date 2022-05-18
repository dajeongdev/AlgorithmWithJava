package Programmers.Level1;

public class 가운데글자가져오기 {
    /**
     * [문제 설명]
     * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
     *
     * [제한사항]
     * s는 길이가 1 이상, 100이하인 스트링입니다.
     *
     * [입출력 예]
     * s	return
     * "abcde"	"c"
     * "qwer"	"we"
     */
    public static String solution(String s) {
        String answer = "";

        int length = s.length();
        if (s.length() % 2 == 0) {
            answer = s.substring((length / 2) - 1, (length / 2) + 1);
        } else {
            answer = String.valueOf(s.charAt(length / 2));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(가운데글자가져오기.solution("abcde"));
        System.out.println(가운데글자가져오기.solution("qwer"));
    }
}
