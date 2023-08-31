package com.Lec17.service;

import com.Lec17.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    //L19 @PostMapping
    //adding the book
    public  Book addBook(Book book)
    {
        list.add(book);
        return book;
    }

    //L20 @DeleteMapping | Deleting Resource REST API
    //delete Boook
    public void deleteBook(int id)
    {
//       list= list.stream().filter(book1 -> {
//            if (book1.getId()!=id)
//            {
//                return true;
//            }
//            else
//            {
//                return false;
//            }
//        }).collect(Collectors.toList());

        //or
        list= list.stream().filter(book1 -> book1.getId()!=id).collect(Collectors.toList());
    }
}
