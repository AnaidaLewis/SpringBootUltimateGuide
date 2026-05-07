package com.anaida.quickstart.dao.impl;

import com.anaida.quickstart.dao.AuthorDao;
import com.anaida.quickstart.domain.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImpl implements AuthorDao {
    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update(
            "INSERT INTO authors (ID, name, age) VALUES (?, ?, ?)",
            author.getID(), author.getName(), author.getAge()
        );
    }
}
