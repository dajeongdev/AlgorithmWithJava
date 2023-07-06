package Programmers.Level0_1;

import java.util.Arrays;

public class OX퀴즈 {
    /**
     * 문제 설명
     * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
     * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다.
     * 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
     * 1 ≤ quiz의 길이 ≤ 10
     * X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
     * X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
     * -10,000 ≤ X, Y ≤ 10,000
     * -20,000 ≤ Z ≤ 20,000
     * [연산자]는 + 와 - 중 하나입니다.
     *
     * 입출력 예
     * quiz	result
     * ["3 - 4 = -3", "5 + 6 = 11"]	["X", "O"]
     * ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 3 - 4 = -3 은 틀린 수식이므로 "X", 5 + 6 = 11 은 옳은 수식이므로 "O" 입니다. 따라서 ["X", "O"]를 return합니다.
     * 입출력 예 #2
     * 19 - 6 = 13 은 옳은 수식이므로 "O", 5 + 66 = 71 은 옳은 수식이므로 "O",
     * 5 - 15 = 63 은 틀린 수식이므로 "X", 3 - 1 = 2는 옳은 수식이므로 "O" 따라서 ["O", "O", "X", "O"]를 return합니다.
     */
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            String operator = split[1];
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[split.length - 1]);
            answer[i] = ((operator.equals("+") ? x + y : x - y) == z) ? "O" : "X";
        }
        return answer;
    }

    public static void main(String[] args) {
        OX퀴즈 T = new OX퀴즈();

        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(Arrays.toString(T.solution(quiz1)));
        System.out.println(Arrays.toString(T.solution(quiz2)));
    }
}
