package DoIt.chapter02;

public class PrimeNumber1 {

    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) break; // 나누어 떨어지면 소수가 아니므로 반복문 탈출
            }
            if (n == i) System.out.println(n); // 마지막까지 나누어 떨어지지 않으면 소수
         }

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
