package Programmers.Level0;

import java.util.stream.Collectors;

public class 외계행성의나이 {
    /**
     * 문제 설명
     * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
     * 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
     * a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
     * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * age는 자연수입니다.
     * age ≤ 1,000
     * PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
     *
     * 입출력 예
     * age	result
     * 23	"cd"
     * 51	"fb"
     * 100	"baa"
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * age가 23이므로 "cd"를 return합니다.
     * 입출력 예 #2
     * age가 51이므로 "fb"를 return합니다.
     * 입출력 예 #3
     * age가 100이므로 "baa"를 return합니다.
     */
    public String solution(int age) {
        String answer = "";
        for (int i = 0; i < String.valueOf(age).length(); i++) {
            switch (String.valueOf(age).charAt(i)) {
                case '0': answer += "a"; break;
                case '1': answer += "b"; break;
                case '2': answer += "c"; break;
                case '3': answer += "d"; break;
                case '4': answer += "e"; break;
                case '5': answer += "f"; break;
                case '6': answer += "g"; break;
                case '7': answer += "h"; break;
                case '8': answer += "i"; break;
                case '9': answer += "j"; break;
            }
        }
        return answer;
    }

    public String otherSolution1(int age) {
        return String.valueOf(age)
                .chars()
                .mapToObj(operand -> String.valueOf((char) (49 + operand)))
                .collect(Collectors.joining());
    }

    public String otherSolution2(int age) {
        String answer = "";
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        외계행성의나이 T = new 외계행성의나이();

        System.out.println(T.solution(23));
        System.out.println(T.solution(51));
        System.out.println(T.solution(100));
    }
}
