package com.sssrikanth.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sssrikanth.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
