package com.wynk.repositories;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wynk.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
