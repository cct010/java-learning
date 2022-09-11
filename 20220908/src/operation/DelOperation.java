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
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入要删除的图书名称：");
        String name = scanner.nextLine();
        int size = bookList.getUsedSize();
        int index =0;//存储找到的下标
        int i = 0;
        for(i = 0;i<size ;i++){
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())==true){
                index = i;
                break;
            }
        }
        if(i>=size){
            System.out.println("没有你要删除的图书。");
            return;
        }
       for(int j = index;j<size-1;j++){
           Book book = bookList.getPos(j+1);
           bookList.setBook(j,book);
       }
       bookList.setBook(size,null);
       bookList.setUsedSize(size-1);
       System.out.println("删除成功！");
    }
}
