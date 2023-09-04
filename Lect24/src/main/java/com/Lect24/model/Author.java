package com.Lect24.model;

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

    public Author(int autId, String firstName, String lastName, String language) {
        this.autId = autId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
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
