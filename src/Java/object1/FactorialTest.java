package Java.object1;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int n) {
        if (n <= 0 || n > 12)
            return -1;
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
