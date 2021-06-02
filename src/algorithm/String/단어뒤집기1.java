package algorithm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기1 { // StringBuilder 사용
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) { // 모두 뒤집기
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        단어뒤집기1 T = new 단어뒤집기1();
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
