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
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.println("请输入要归还的图书名称：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        for(int i =0;i<size;i++){
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                if(book.isBorrower()==true){
                    book.setBorrower(false);
                    System.out.println("归还成功");
                    return;
                }
                System.out.println("书籍未被借出！");
            }
        }
        System.out.println("归还书籍名称错误！");
    }
}
