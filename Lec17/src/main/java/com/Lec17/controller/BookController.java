package com.Lec17.controller;

import com.Lec17.model.Book;
import com.Lec17.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    //public List<Book> getBooks()
    public ResponseEntity<List<Book>> getBooks()
    {
//        Book book = new Book(1,"Java","Jhon");
//               return book;
//        //BY using fake service
//        return this.bookService.getAllBooks();
        List<Book>list=this.bookService.getAllBooks();
        if (list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/book/{id}")
    //public Book getBook(@PathVariable("id") int id)
    public ResponseEntity<Book >getBook(@PathVariable("id") int id)
    {
        Book book=this.bookService.getBookById(id);
        if(book==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
    //Lecture 19 @PostMapping
    //new book handler
    @PostMapping("/createBook")
    //public Book addBook(@RequestBody Book book)
    public ResponseEntity<Book> addBook(@RequestBody Book book)
    {
        Book  b=null;
        try
        {
            b=this.bookService.addBook(book);
            return ResponseEntity.of(Optional.of(b));
        }catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //L20 @DeleteMapping | Deleting Resource REST API
    //delete book handler
    @DeleteMapping("/deleteBook/{id}")
    @ResponseBody//for rest controller their is no need of it.
    public ResponseEntity<Void> deleteBook(@PathVariable("id") int id)
    {
        try {
            this.bookService.deleteBook(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    //L21 @PutMapping | Updating the Resource creating api using spring boot
    //Update Book Handler
    @PutMapping("/book/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id")int id,@RequestBody Book book)
    {
        try {
            this.bookService.updateBook(id,book);
            return ResponseEntity.ok().body(book);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
