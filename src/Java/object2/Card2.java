package Java.object2;

public class Card2 {
    final String KIND;
    final int NUMBER;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num) {
        NUMBER = num;
        KIND = kind;
    }

    Card2() {
        this("HEART", 1);
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}