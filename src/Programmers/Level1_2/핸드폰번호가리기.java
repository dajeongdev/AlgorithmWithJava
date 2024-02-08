package Programmers.Level1_2;

public class 핸드폰번호가리기 {
    /**
     * 문제 설명
     * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
     * 전화번호가 문자열 phone_number로 주어졌을 때,
     * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
     *
     * 제한 조건
     * phone_number는 길이 4 이상, 20이하인 문자열입니다.
     *
     * 입출력 예
     * phone_number	return
     * "01033334444"	"*******4444"
     * "027778888"	"*****8888"
     */
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }

    public String otherSolution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        핸드폰번호가리기 T = new 핸드폰번호가리기();

        System.out.println(T.solution("01033334444"));
        System.out.println(T.solution("027778888"));
        System.out.println(T.otherSolution("01033334444"));
        System.out.println(T.otherSolution("027778888"));
    }
}
