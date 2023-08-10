package Java.object2;

public class Point {
    int x; // x좌표
    int y; // y좌표

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")";
    }
}
