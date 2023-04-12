package DoIt.chapter01;

public class Q7to9 {

    static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    /** ( 양쪽 두 수의 합 x ( 두 수 사이의 숫자의 수 + 1 ) ) / 2 **/
    static int gauss(int n) {
        return ((1 + n) * n) / 2;
    }

    static int sumOf(int a, int b) {
//        int sum = 0;
//        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) sum += i;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return ((min + max) * (max - min + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sumN(7));
        System.out.println(gauss(7));
        System.out.println(sumOf(3, 5));
        System.out.println(sumOf(6, 4));
    }
}
