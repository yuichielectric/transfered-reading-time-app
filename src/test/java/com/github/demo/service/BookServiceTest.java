package com.github.demo.service;

import com.github.demo.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for BookService
 */
public class BookServiceTest {

    private BookService bookService;

    @Test
    public void testBookTitles() {
        List<Book> books = bookService.getBooks();
        for (Book book : books) {
            assertNotEquals("Book title must not be empty", 0, book.getTitle().length());
        }
    }

    @Before
    public void setUp() throws Exception{
        bookService = new BookService();
    }

    @After
    public void tearDown() {
        bookService = null;
    }

}
