import com.chen.config.SpringConfig;
import com.chen.pojo.Book;
import com.chen.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById() {
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setType("chen");
        book.setName("hsad");
        book.setDescription("asdkas");

        bookService.save(book);
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);

    }

}
