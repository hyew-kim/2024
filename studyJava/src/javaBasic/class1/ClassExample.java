package javaBasic.class1;

public class ClassExample {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    public static class MovieReview {
        String title;
        String review;
    }

    public static void ex1() {
        /*
            문제: 영화 리뷰 관리하기1
            당신은 영화 리뷰 정보를 관리하려고 한다. 먼저, 영화 리뷰 정보를 담을 수 있는 `MovieReview` 클래스를 만들어보자.

            **요구 사항**
                1. `MovieReview` 클래스는 다음과 같은 멤버 변수를 포함해야 한다. 영화 제목 ( `title` ), 리뷰 내용 ( `review` )
                2. `MovieReviewMain` 클래스 안에 `main()` 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하자.

            **출력 예시**
                영화 제목: "인셉션", 리뷰: "인생은 무한 루프" 영화 제목: "어바웃 타임", 리뷰: "인생 시간 영화!"

        * */
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.printf("영화 제목: \"%s\", 리뷰:  \"%s\" ", movieReview.title, movieReview.review);
        }
    }

    public static class ProductOrder {
        String productName;
        int price;
        int quantity;
    }

    public static void ex2() {
        /*문제: 상품 주문 시스템 개발 **문제 설명**
            당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
            먼저, 상품 주문 정보를 담을 수 있는 `ProductOrder` 클래스를 만들어보자.

            **요구 사항**
              1.`ProductOrder` 클래스는 다음과 같은 멤버 변수를 포함해야 한다. 상품명 ( `productName` ), 가격 ( `price` ), 주문 수량 ( `quantity` )
              2. `ProductOrderMain` 클래스 안에 `main()` 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
            출력 예시와 같도록 출력하면 된다.

            **출력 예시**
            상품명: 두부, 가격: 2000, 수량: 2
            상품명: 김치, 가격: 5000, 수량: 1
            상품명: 콜라, 가격: 1500, 수량: 2
            총 결제 금액: 12000
            */
        ProductOrder tofuOrder = new ProductOrder();
        tofuOrder.productName = "두부";
        tofuOrder.price = 2000;
        tofuOrder.quantity = 2;

        ProductOrder kimchiOrder = new ProductOrder();
        kimchiOrder.productName = "김치";
        kimchiOrder.price = 5000;
        kimchiOrder.quantity = 1;

        ProductOrder cokeOrder = new ProductOrder();
        cokeOrder.productName = "콜라";
        cokeOrder.price = 1500;
        cokeOrder.quantity = 2;

        ProductOrder[] productOrders = {tofuOrder, kimchiOrder, cokeOrder};
        int totalPaymentPrice = 0;

        for (ProductOrder productOrder : productOrders) {
            totalPaymentPrice += productOrder.price * productOrder.quantity;
            System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", productOrder.productName, productOrder.price, productOrder.quantity);
        }
        System.out.printf("총 결제금액: %d", totalPaymentPrice);

    }
}
