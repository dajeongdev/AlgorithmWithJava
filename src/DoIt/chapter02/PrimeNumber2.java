package DoIt.chapter02;

public class PrimeNumber2 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수

        for (int n = 3; n <= 1000; n += 2) { // 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나눠보기
                counter++;
                if (n % prime[i] == 0) break; // 나누어 떨어지면 소수 아님
            }
            if (ptr == i) prime[ptr++] = n; // 마지막가지 나누어 떨어지지 않음 -> 소수
        }

        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
