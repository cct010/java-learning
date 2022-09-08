package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:47
 */
//抽象类
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doWork(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }
}
