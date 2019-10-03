package org.senolab.senolibrary.repository;

import org.senolab.senolibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
