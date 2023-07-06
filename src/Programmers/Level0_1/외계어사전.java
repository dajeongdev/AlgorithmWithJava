package Programmers.Level0_1;

public class 외계어사전 {
    /**
     * 문제 설명
     * PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
     * 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
     * spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
     * 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
     * 2 ≤ spell의 크기 ≤ 10
     * spell의 원소의 길이는 1입니다.
     * 1 ≤ dic의 크기 ≤ 10
     * 1 ≤ dic의 원소의 길이 ≤ 10
     * spell의 원소를 모두 사용해 단어를 만들어야 합니다.
     * spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
     * dic과 spell 모두 중복된 원소를 갖지 않습니다.
     *
     * 입출력 예
     * spell	dic	result
     * ["p", "o", "s"]	["sod", "eocd", "qixm", "adio", "soo"]	2
     * ["z", "d", "x"]	["def", "dww", "dzx", "loveaw"]	1
     * ["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	2
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * "p", "o", "s" 를 조합해 만들 수 있는 단어가 dic에 존재하지 않습니다. 따라서 2를 return합니다.
     * 입출력 예 #2
     * "z", "d", "x" 를 조합해 만들 수 있는 단어 "dzx"가 dic에 존재합니다. 따라서 1을 return합니다.
     * 입출력 예 #3
     * "s", "o", "m", "d" 를 조합해 만들 수 있는 단어가 dic에 존재하지 않습니다. 따라서 2을 return합니다.
     *
     * 유의사항
     * 입출력 예 #3 에서 "moos", "smm", "som"도 "s", "o", "m", "d" 를 조합해 만들 수 있지만 spell의 원소를 모두 사용해야 하기 때문에 정답이 아닙니다.
     */
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (String dicStr : dic) {
            boolean check = true;
            for (String spellStr : spell) {
                if (dicStr.indexOf(spellStr) == -1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        외계어사전 T = new 외계어사전();

        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(T.solution(spell1, dic1));
        System.out.println(T.solution(spell2, dic2));
        System.out.println(T.solution(spell3, dic3));
    }
}
