package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:24
 */
public class DisplayOperation implements  IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");
        int size = bookList.getUsedSize();
        for(int i =0;i<size;i++){
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
