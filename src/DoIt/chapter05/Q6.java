package DoIt.chapter05;

import java.util.Scanner;

public class Q6 {

    static String[] name = {"A 기둥", "B 기둥", "C 기둥"};

    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.println("원반[" + no + "]을 " + name[x - 1] + "에서 " + name[y - 1] + "으로 이동한다.");

        if (no > 1)
            move(no - 1, 6 - x- y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 갯수 : ");
        int no = sc.nextInt();

        move(no, 1, 3);
    }
}
