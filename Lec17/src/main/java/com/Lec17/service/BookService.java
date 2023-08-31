package com.Lec17.service;

import com.Lec17.model.Book;
import com.Lec17.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//creating fake service
@Component
@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;
//    private static List<Book> list = new ArrayList<>();
//    static //static block
//    {
//       list.add(new Book(1,"java","JavaAuth"));
//        list.add(new Book(2,"java-Script","JavaScript_Auth"));
//        list.add(new Book(3,"Python","PythonAuth"));
//    }
    //get all book
    public List<Book>getAllBooks()
    {
       // return list;
        return this.bookRepository.findAll();
    }

    //get single book by id
    public Book getBookById(int id)
    {
        Optional<Book> book=null;
        try {
           // book=   list.stream().filter(e-> e.getId()==id).findFirst().get();
            book=this.bookRepository.findById(id);
        }catch ( Exception e)
        {
            e.printStackTrace();
        }

     return book.get();
    }
    //L19 @PostMapping
    //adding the book
    public  Book addBook(Book book)
    {
       // list.add(book);
       return this.bookRepository.save(book);
       // return book;
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
        //list= list.stream().filter(book1 -> book1.getId()!=id).collect(Collectors.toList());
        bookRepository.deleteById(id);
    }
    //L21 @PutMapping | Updating the Resource creating api using spring boot
    //update the book
    //here we are using map() because we have not required to filter out
    //we have required to perform operation on same list
    public Book updateBook(int id, Book book)
    {
//        list= list.stream().map(book1 -> {
//             if(book1.getId()==id)
//             {
//                 book1.setTitle(book.getTitle());
//                 book1.setAuthor(book.getAuthor());
//             }
//             return book1;
//         }).collect(Collectors.toList());
        book.setId(id);
        bookRepository.save(book);
        return book;
    }

}
