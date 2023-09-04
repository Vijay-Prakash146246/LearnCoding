package com.Lect24.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Book_Table")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String title;
   // @OneToOne//every book has only one author unidirectional
    @OneToOne(cascade = CascadeType.ALL)//all related operation get performed automatically
    //if you not  write this cascade = CascadeType.ALL then it will give forigen key exception
    private Author author;

    public Book() {
    }

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
