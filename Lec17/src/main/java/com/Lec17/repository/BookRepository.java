package com.Lec17.repository;

import com.Lec17.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer>
{

}
