package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:25
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}
