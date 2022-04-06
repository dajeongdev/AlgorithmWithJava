package Programmers.Level1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    /**
     * [문제 설명]
     * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
     * "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
     * seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
     *
     * [제한 사항]
     * seoul은 길이 1 이상, 1000 이하인 배열입니다.
     * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
     * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
     *
     * [입출력 예]
     * seoul	return
     * ["Jane", "Kim"]	"김서방은 1에 있다"
     */
    public String solution(String[] seoul) {
        int x = 0;

        /**
         * break를 넣어야 한 번이라도 덜 반복하니까 기억해두자!
         */
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }

        return "김서방은 " + x + "에 있다";
    }

    /**
     * 참고할 만한 다른 풀이
      */
    public String otherAnswer(String[] seoul){
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
