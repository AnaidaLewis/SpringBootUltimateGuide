package com.anaida.quickstart.dao;

import com.anaida.quickstart.domain.Book;

import java.util.Optional;

public interface BookDao {

    Optional<Book> findOne(String isin);
}
