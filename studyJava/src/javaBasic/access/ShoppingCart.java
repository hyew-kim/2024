package javaBasic.access;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();
    private final int LIMIT = 10;

    public void addItem(Item newItem) {
        if (items.size() > LIMIT) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items.add(newItem);
    }

    private int getTotalPrice() {
        return items.stream().map(Item::getTotalPrice).reduce(0, Integer::sum);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("빈 장바구니 입니다.");
            return;
        }
        System.out.println("장바구니 상품 출력");
        items.forEach(item -> System.out.printf("상품명:%s, 합계:%d\n", item.getName(), item.getTotalPrice()));
        System.out.printf("전체 가격 합:%d\n", getTotalPrice());
    }
}
