package javaBasic.construct;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    Book() {
        this("", "", 0);  // 생성자 첫 줄에서만 this() 사용가능..!
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }


    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

}
