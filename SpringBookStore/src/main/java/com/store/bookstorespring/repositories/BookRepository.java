package com.store.bookstorespring.repositories;

import com.store.bookstorespring.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
