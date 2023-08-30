package com.Lec17.controller;

import com.Lec17.model.Book;
import com.Lec17.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//L18 Creating REST API using Spring Boot
//@Controller
//For rest controller use @Restcontroller and then their is no need to use @ResponseBody
@RestController //so this is good
public class BookController
{
    @Autowired
private BookService bookService;
    //@RequestMapping(value = "/books",method = RequestMethod.GET)
    //@ResponseBody //for returning as a string not as a vies
    @GetMapping("/books")
    public List<Book> getBooks()
    {
//        Book book = new Book(1,"Java","Jhon");
//               return book;
        //BY using fake service
        return this.bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return  this.bookService.getBookById(id);
    }
}
