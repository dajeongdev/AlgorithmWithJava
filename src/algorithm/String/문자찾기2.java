package algorithm.String;

import java.util.Scanner;

public class 문자찾기2 {
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char t : str.toCharArray()) {
            if(t == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자찾기1 T = new 문자찾기1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
