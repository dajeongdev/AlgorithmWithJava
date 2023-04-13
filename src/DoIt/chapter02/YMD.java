package DoIt.chapter02;

// Q11
public class YMD {

    int y; // 연
    int m; // 월 (1~12)
    int d; // 일 (1~31)

    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    YMD after(int n) {
        this.d += n;
        return new YMD(y, m, d);
    }

    YMD before(int n) {
        this.d -= n;
        return new YMD(y, m, d);
    }
}
