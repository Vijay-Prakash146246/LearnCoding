package com.Lec17.controller;

import com.Lec17.model.Book;
import com.Lec17.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    //Lecture 19 @PostMapping
    //new book handler
    @PostMapping("/createBook")
    public Book addBook(@RequestBody Book book)
    {
       return this.bookService.addBook(book);
    }

    //L20 @DeleteMapping | Deleting Resource REST API
    //delete book handler
    @DeleteMapping("/deleteBook/{id}")
    @ResponseBody//for rest controller their is no need of it.
    public String deleteBook(@PathVariable("id") int id)
    {
        this.bookService.deleteBook(id);
        return "Sucessfully get Deleted";
    }

}
