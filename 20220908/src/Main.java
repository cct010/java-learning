import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:47
 */
public class Main {
    public static User login(){
        System.out.println("请输入你的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1：管理员；0：普通用户");
        int select = scanner.nextInt();
        if(select == 1){
            return new AdminUser(name);
        }
        else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true){
            int select = user.menu();//动态绑定，多态
            user.doWork(select,bookList);
        }
    }
}
