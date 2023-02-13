package com.chen;

import com.chen.pojo.Book;
import com.chen.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    public void testById() {
        Book book = bookService.getById(2);
        System.out.println(book);


    }

}
