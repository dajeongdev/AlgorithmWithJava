package algorithm.Array2;

import java.util.Scanner;

public class 가위바위보  {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            if(a[i] == b[i]) {
                answer += "D";
            } else if(a[i] == 1 && b[i] == 3) { // 가위 - 보
                answer += "A";
            } else if(a[i] == 2 && b[i] == 1) { // 바위 - 가위
                answer += "A";
            } else if(a[i] == 3 && b[i] == 2) { // 보 - 바위
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        가위바위보 T = new 가위바위보();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for(char x : T.solution(n, a, b).toCharArray()) {
            System.out.println(x);
        }
    }
}
