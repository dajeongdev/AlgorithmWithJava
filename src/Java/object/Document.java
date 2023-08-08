package Java.object;

public class Document {
    static int count = 0;
    String name; // 문서명

    Document() { // 문서 생성 시 문서명을 지정하지 않을 경우
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "이/가 생성되었습니다.");
    }
}
