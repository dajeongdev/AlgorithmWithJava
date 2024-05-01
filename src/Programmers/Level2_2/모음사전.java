package Programmers.Level2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 모음사전 {
    /**
     * 문제 설명
     * 사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록되어 있습니다.
     * 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA"이며, 마지막 단어는 "UUUUU"입니다.
     *
     * 단어 하나 word가 매개변수로 주어질 때, 이 단어가 사전에서 몇 번째 단어인지 return 하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * word의 길이는 1 이상 5 이하입니다.
     * word는 알파벳 대문자 'A', 'E', 'I', 'O', 'U'로만 이루어져 있습니다.
     *
     * 입출력 예
     * word	result
     * "AAAAE"	6
     * "AAAE"	10
     * "I"	1563
     * "EIO"	1189
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * 사전에서 첫 번째 단어는 "A"이고, 그다음은 "AA", "AAA", "AAAA", "AAAAA", "AAAAE", ... 와 같습니다. "AAAAE"는 사전에서 6번째 단어입니다.
     * 입출력 예 #2
     * "AAAE"는 "A", "AA", "AAA", "AAAA", "AAAAA", "AAAAE", "AAAAI", "AAAAO", "AAAAU"의 다음인 10번째 단어입니다.
     * 입출력 예 #3
     * "I"는 1563번째 단어입니다.
     * 입출력 예 #4
     * "EIO"는 1189번째 단어입니다.
     */
    // TODO 다시 풀어보기..
    static int count = 1;
    static HashMap<String, Integer> map = new HashMap<>();
    public int firstSolution(String word) {
        init(0, "");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char target = word.charAt(i);
            if (target == 'A') {
                sb.append(0);
            } else if (target == 'E') {
                sb.append(1);
            } else if (target == 'I') {
                sb.append(2);
            } else if (target == 'O') {
                sb.append(3);
            } else if (target == 'U') {
                sb.append(4);
            }
        }
        return map.get(sb.toString());
    }

    private static void init(int depth, String temp) {
        if (depth == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            String next = temp + i;
            map.put(next, count);
            count++;
            init(depth + 1, next);
        }
    }

    /**
     * DFS 사용
     */
    final char[] WORDS = {'A', 'E', 'I', 'O', 'U'};
    final int MAX_LENGTH = 5;
    public int secondSolution(String word) {
        int answer = 0;

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < WORDS.length; i++) {
            dfs(elements, String.valueOf(WORDS[i]));
        }

        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(word)) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    private void dfs(List<String> elements, String temp) {
        if (temp.length() > MAX_LENGTH) {
            return;
        }

        if (!elements.contains(temp)) {
            elements.add(temp);
        }

        for (int i = 0; i < WORDS.length; i++) {
            dfs(elements, temp + WORDS[i]);
        }
    }

    public static void main(String[] args) {
        모음사전 T = new 모음사전();

        System.out.println(T.firstSolution("AAAAE"));
        System.out.println(T.firstSolution("AAAE"));
        System.out.println(T.firstSolution("I"));
        System.out.println(T.firstSolution("EIO"));
        System.out.println(T.secondSolution("AAAAE"));
        System.out.println(T.secondSolution("AAAE"));
        System.out.println(T.secondSolution("I"));
        System.out.println(T.secondSolution("EIO"));
    }
}
