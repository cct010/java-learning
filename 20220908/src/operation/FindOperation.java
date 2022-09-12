package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:25
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查询图书！");
        System.out.println("请输入要查询的图书名字：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for(int i=0;i<size;i++){
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                System.out.println(book);
                return ;
            }
        }
        System.out.println("没有你要查询的图书！");
    }
}
