package com.Lect24.service;


import com.Lect24.model.Book;
import com.Lect24.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;
    //get all books
    public List<Book>getAllBooks()
    {
        return this.bookRepository.findAll();
    }

    //get single book by id
    public Book getBookById(int id)
    {
        Optional<Book> book=null;
        try
        {
            book=this.bookRepository.findById(id);
        }catch ( Exception e)
        {
            e.printStackTrace();
        }

     return book.get();
    }
    //adding the book
    public  Book addBook(Book book)
    {
       return this.bookRepository.save(book);
    }

    //delete Boook
    public void deleteBook(int id)
    {

        bookRepository.deleteById(id);
    }
    //update the book
    //here we are using map() because we have not required to filter out
    //we have required to perform operation on same list
    public Book updateBook(int id, Book book)
    {
        book.setId(id);
        bookRepository.save(book);
        return book;
    }

}
