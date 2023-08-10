package Java.object1;

public class Product {
    static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;         // 인스턴스의 고유 번호

    { // Product 인스턴스가 생성될 떄마다 count의 값을 1씩 증가시켜서 serialNo에 저장함
        serialNo = ++count;
    }

    // 기본 생성자, 생략 가능
    public Product() {}
}
