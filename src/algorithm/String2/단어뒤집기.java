package algorithm.String2;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    public ArrayList<String> solution(String[] s) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : s) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        /*
        for(String x : s) {
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;

            while(lt < rt) { // 0보다 크면
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
         */
        return answer;
    }

    public static void main(String[] args) {
        단어뒤집기 T = new 단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = kb.next();
        }

        for(String x : T.solution(s)) {
            System.out.println(x);
        }
    }
}
