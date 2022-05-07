package Programmers.Level1;

public class 자연수뒤집어배열만들기 {
    /**
     * [문제 설명]
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
     * 예를 들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     *
     * [제한 조건]
     * n은 10,000,000,000이하인 자연수입니다.
     *
     * [입출력 예]
     * n	return
     * 12345	[5,4,3,2,1]
     */
    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int[] answer = new int[chars.length];

        int index = 0;
        for (int i = (chars.length - 1); i >= 0; i--) {
            answer[index++] = Integer.parseInt(String.valueOf(chars[i]));
        }

        return answer;
    }

    /**
     * 참고할 만한 풀이
     */
    public int[] otherAnswer1(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }

    public int[] otherAnswer2(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }
}
