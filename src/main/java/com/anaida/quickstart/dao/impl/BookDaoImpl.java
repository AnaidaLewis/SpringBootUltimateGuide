package com.anaida.quickstart.dao.impl;

import com.anaida.quickstart.dao.BookDao;
import com.anaida.quickstart.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

public class BookDaoImpl implements BookDao {

    private final JdbcTemplate jdbcTemplate;

    public BookDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(Book book) {
        jdbcTemplate.update(
                "INSERT INTO book (isin, title, AUTHOR_ID) VALUES (?, ?, ?)",
                book.getIsin(), book.getTitle(), book.getAUTHOR_ID()
        );
    }
}
