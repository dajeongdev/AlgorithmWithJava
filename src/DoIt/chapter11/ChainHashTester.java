package DoIt.chapter11;

import DoIt.chapter10.BinTree;

import java.util.Scanner;

// 체인법에 의한 해시 클래스 ChainHash<K, V>의 이용 예시
public class ChainHashTester {

    static Scanner sc = new Scanner(System.in);

    // 데이터 (회원 번호 + 이름)
    static class Data {
        static final int NO = 1;   // 번호를 입력 받습니까?
        static final int NAME = 2; // 이름을 입력 받습니까?

        private Integer no;  // 회원 번호
        private String name; // 이름

        // 키 값
        Integer keyCode() {
            return no;
        }

        // 문자열을 반환합니다.
        public String toString() {
            return name;
        }

        // 데이터를 입력합니다.
        void scanData(String guide, int sw) {
            System.out.println(guide + "할 데이터를 입력하세요.");

            if ((sw & NO) == NO) {
                System.out.print("번호 : ");
                no = sc.nextInt();
            }
            if ((sw & NAME) == NAME) {
                System.out.print("이름 : ");
                name = sc.next();
            }
        }

        // 메뉴 열거형
        enum Menu {
            ADD("삽입"),
            REMOVE("삭제"),
            SEARCH("검색"),
            DUMP("표시"),
            TERMINATE("종료");

            private final String message; // 출력할 문자열

            // 서수가 idx인 열거를 반환
            static Menu MenuAt(int idx) {
                for (Menu m : Menu.values())
                    if (m.ordinal() == idx)
                        return m;
                return null;
            }

            // 생성자
            Menu(String string) {
                message = string;
            }

            // 출력할 문자열을 반환
            String getMessage() {
                return message;
            }
        }

        // 메뉴 선택
        static Menu SelectMenu() {
            int key;
            do {
                for (Menu m : Menu.values())
                    System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
                System.out.print(" : ");
                key = sc.nextInt();
            } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

            return Menu.MenuAt(key);
        }

        public static void main(String[] args) {
            Menu menu;              // 메뉴
            Data data;              // 추가용 데이터 참조
            Data temp = new Data(); // 입력용 데이터

            ChainHash<Integer, Data> hash = new ChainHash<>(13);

            do {
                switch (menu = SelectMenu()) {
                    case ADD: // 추가
                        data = new Data();
                        data.scanData("추가", Data.NO | Data.NAME);
                        hash.add(data.keyCode(), data);
                        break;

                    case REMOVE: // 삭제
                        temp.scanData("삭제", Data.NO);
                        hash.remove(temp.keyCode());
                        break;

                    case SEARCH: // 검색
                        temp.scanData("검색", Data.NO);
                        Data t = hash.search(temp.keyCode());
                        if (t != null)
                            System.out.println("그 키를 갖는 데이터는 " + t + "입니다.");
                        else
                            System.out.println("그 데이터가 없습니다.");
                        break;

                    case DUMP: // 모든 노드를 키 값의 오름차순으로 출력
                        hash.dump();
                        break;
                }
            } while (menu != Menu.TERMINATE);
        }
    }
}
