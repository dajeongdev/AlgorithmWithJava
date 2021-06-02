package algorithm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기2 { // 직접 뒤집기
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() -1;

            while(lt < rt) { // 0보다
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        단어뒤집기2 T = new 단어뒤집기2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
