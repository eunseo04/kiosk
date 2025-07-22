package org.example.Practice;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String description;
    private String isBorrowed;
    private List<Book> book = new ArrayList<>();

    Book(String title, String author, String description, String isBorrowed) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isBorrowed = isBorrowed;
    }

    Book(){}

    public void menu() {
        for(Book bookItem : book) {
            System.out.println(bookItem.getTitle()+" | "+bookItem.getAuthor()+" | "+bookItem.getDescription()+" | "+bookItem.getIsBorrowed());
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getIsBorrowed() {
        return isBorrowed;
    }

    public List<Book> getBook() {
        return book;
    }
}
