package com.Lect24.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Author_Table")
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int autId;
    private String firstName;
    private  String lastName;
    private String language;
    //for implementation of bidirectional mapping because book has author and author has book
    @OneToOne(mappedBy = "author") //for not creating extra column mappedBy = "author"
    //Here i think author act as a child and book as a parent
    @JsonBackReference
    private  Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author(int autId, String firstName, String lastName, String language,Book book) {
        this.autId = autId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.book = book;
    }

    public Author() {
    }

    public int getAutId() {
        return autId;
    }

    public void setAutId(int autId) {
        this.autId = autId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
