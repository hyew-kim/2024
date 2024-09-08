package javaBasic.access;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private final int price;
    private final int cnt;

    public Item(String name, int price, int cnt) {
        this.name = name;
        this.price = price;
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    /*Item의 데이터인 price와 cnt에 대한 연산이니
    외부에서 계산하는게 아닌 객체 내부 메소드에서 처리하는게 더 바람직
    * */
    public int getTotalPrice() {
        return price * cnt;
    }
}
