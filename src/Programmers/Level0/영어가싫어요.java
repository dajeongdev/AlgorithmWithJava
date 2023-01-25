package Programmers.Level0;

public class 영어가싫어요 {
    /**
     * 문제 설명
     * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
     * 문자열 numbers가 매개변수로 주어질 때,
     * numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * numbers는 소문자로만 구성되어 있습니다.
     * numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
     * 1 ≤ numbers의 길이 ≤ 50
     * "zero"는 numbers의 맨 앞에 올 수 없습니다.
     *
     * 입출력 예
     * numbers	result
     * "onetwothreefourfivesixseveneightnine"	123456789
     * "onefourzerosixseven"	14067
     *
     * 입출력 예 설명
     * 입출력 예 #1
     * "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
     * 입출력 예 #1
     * "onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.
     */
    public long solution(String numbers) {
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < numStr.length; i++) {
            numbers = numbers.replace(numStr[i], num[i]);
        }
        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        영어가싫어요 T = new 영어가싫어요();

        System.out.println(T.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(T.solution("onefourzerosixseven"));
    }
}
