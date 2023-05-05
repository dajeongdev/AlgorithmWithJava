package DoIt.chapter05;

import DoIt.chapter04.IntStack;

public class RecursiveX2 {

    static void recursive(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n -= 1;
                continue;
            }
            if (!s.isEmpty()) {
                n = s.pop();
                System.out.println(n);
                n -= 2;
                continue;
            }
            break;
        }
    }
}
