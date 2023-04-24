package DoIt.chapter04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntQueueAndQ5 que = new IntQueueAndQ5(64); // 최대 64개를 인큐할 수 있는 큐
        while (true) {
            System.out.println("현재 데이터 수 : " + que.size() + "/" + que.capacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");
            int menu = sc.nextInt();

            if (menu == 0) break;
            int x;
            switch(menu) {
                case 1: // 인큐
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        que.enqueue(x);
                    } catch (IntQueueAndQ5.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2: // 디큐
                    try {
                        x = que.dequeue();
                        System.out.println("삭제한 데이터는 " + x + "입니다.");
                    } catch (IntQueueAndQ5.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3: // 피크
                    try {
                        x = que.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntQueueAndQ5.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                case 4: // 덤프
                    que.dump();
                    break;
            }
        }
    }
}
