package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:26
 */
public interface IOperation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
