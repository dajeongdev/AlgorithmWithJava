package Java.object2;

public class ParserManager {
    // 리턴 타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}
