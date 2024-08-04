package javaBasic.oop.ex1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle simpleRectangle = new Rectangle();
        simpleRectangle.setWidth(5);
        simpleRectangle.setHeight(8);
        int area = simpleRectangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = simpleRectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = simpleRectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

//    static int calculateArea(int width, int height) {
//        return width * height;
//    }
//    static int calculatePerimeter(int width, int height) {
//        return 2 * (width + height);
//    }
//    static boolean isSquare(int width, int height) {
//        return width == height;
//    }
}
