package com.sparta.library.book.repository;

import com.sparta.library.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    Optional<BookEntity> findFirstByTitleAndAuthorAndLanguageAndPublisherOrderByRegistrationDateDesc(String title, String author, String language, String publisher);
    List<BookEntity> findAllByOrderByRegistrationDate();
}