package Java.object2;

public class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}
