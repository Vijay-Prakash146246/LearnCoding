package com.Lec17.service;

import com.Lec17.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
 //creating fake service
@Component
public class BookService
{
    private static List<Book> list = new ArrayList<>();
    static //static block
    {
       list.add(new Book(1,"java","JavaAuth"));
        list.add(new Book(2,"java-Script","JavaScript_Auth"));
        list.add(new Book(3,"Python","PythonAuth"));
    }
    //get all book
    public List<Book>getAllBooks()
    {
        return list;
    }
    //get single book by id
    public Book getBookById(int id)
    {
        Book book=null;
     book=   list.stream().filter(e-> e.getId()==id).findFirst().get();
     return book;
    }
}
