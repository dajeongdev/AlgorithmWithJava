package DoIt.chapter04;

import java.util.Scanner;

// int 스택의 사용 예시
public class IntStackTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStack stack = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택
        while (true) {
            System.out.println("현재 데이터 수 : " + stack.size() + "/" + stack.capacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4)덤프 (0) 종료 : ");

            int menu = sc.nextInt();

            if (menu == 0) break;

            int x;
            switch(menu) {
                case 1: // 푸시
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2: // 팝
                    try {
                        x = stack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3: // 피크
                    try {
                        x = stack.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 4: // 덤프
                    stack.dump();
                    break;
            }
        }
    }
}
