package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
    private String author;
    private int isbn;

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
