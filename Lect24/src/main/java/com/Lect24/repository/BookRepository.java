package com.Lect24.repository;

import com.Lect24.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>
{

}
