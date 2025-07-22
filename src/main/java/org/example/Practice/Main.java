package org.example.Practice;

public class Main {
    public static void main(String[] args) {
        Book books = new Book();
        books.getBook().add(new Book("해리포터","J.K. 롤링","마법 학교에서 벌어지는 이야기", "대여 가능"));
        books.getBook().add(new Book("칼의 노래","김훈","이순신 장군의 마지막 전투","대여 중"));
        books.menu();
        //Library library = new Library(books);
    }
}
