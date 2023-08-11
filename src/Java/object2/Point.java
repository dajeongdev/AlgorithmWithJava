package Java.object2;

public class Point {
    int x = 10; // x좌표
    int y = 20; // y좌표

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

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}
