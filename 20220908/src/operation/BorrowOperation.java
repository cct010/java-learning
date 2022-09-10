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
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入要借阅的图书名称：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for(int i= 0;i<size ;i++){
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                book.setBorrower(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要借阅的书！");
    }
}
