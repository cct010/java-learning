package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:23
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        System.out.println("请输入要新增的图书名称：");
        String name  = scanner.nextLine();
        System.out.println("请输入作者名字：");
        String author = scanner.nextLine();
        System.out.println("请输入图书类型：");
        String type = scanner.nextLine();
        System.out.println("请输入图书价格：");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);
        int size = bookList.getUsedSize();
        bookList.setBook(size,book);
        bookList.setUsedSize(size+1);
        System.out.println("新增图书成功！");
    }
}
