package com.anaida.quickstart.dao.impl;

import com.anaida.quickstart.dao.BookDao;
import com.anaida.quickstart.domain.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Book> findOne(String isin) {
        List<Book> results = jdbcTemplate.query(
                "SELECT isin, title, AUTHOR_ID from books WHERE isin = ? LIMIT 1",
                new BookRowMapper(), isin);

        return results.stream().findFirst();
    }

    public static class BookRowMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Book.builder()
                    .isin(rs.getString("isbn"))
                    .title(rs.getString("title"))
                    .AUTHOR_ID(rs.getLong("AUTHOR_ID"))
                    .build();
        }
    }
}
