package algorithm.String2;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(c[rt])) {
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);

        return answer;
    }
    public static void main(String[] args) {
        특정문자뒤집기 T = new 특정문자뒤집기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
