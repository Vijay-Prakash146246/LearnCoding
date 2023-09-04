package com.Lect24.controller;

import com.Lect24.model.Book;
import com.Lect24.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController
{
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks()
    {
        List<Book> list=this.bookService.getAllBooks();
        if (list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book>getBook(@PathVariable("id") int id)
    {
        Book book=this.bookService.getBookById(id);
        if(book==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
    //new book handler
    @PostMapping("/createBook")
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

    //delete book handler
    @DeleteMapping("/deleteBook/{id}")
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
