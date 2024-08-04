package javaBasic.oop.ex1;

public class Rectangle {
    /*  문제1 - 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
      다음은 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.
      - 절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경해라.
      - `Rectangle` 클래스를 만들어라.
      - `RectangleOopMain` 에 해당 클래스를 사용하는 `main()` 코드를 만들어라.*/
    private int width = 0;
    private int height = 0;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare() {
        return this.width == this.height;
    }
}
