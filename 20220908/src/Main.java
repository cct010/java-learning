import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-08
 * Time: 19:47
 */
public class Main {
    public static void menu(int x){
        switch (x){
            case 1:
                System.out.println("============欢迎来到图书馆=========");
                System.out.println("1.查找图书");
                System.out.println("2.新增图书");
                System.out.println("3.删除图书");
                System.out.println("4.显示图书");
                System.out.println("0.退出系统");
                System.out.println("=================================");
                break;
            case 0:
                System.out.println("============欢迎来到图书馆=========");
                System.out.println("1.查找图书");
                System.out.println("2.借阅图书");
                System.out.println("3.归还图书");
                System.out.println("0.退出系统");
                System.out.println("=================================");
                break;
            default:break;
        }

    }
    public static void main(String[] args) {
        System.out.println("请输入你的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1：管理员；0：普通用户");
        int select = scanner.nextInt();
        menu(select);
        int select1 = scanner.nextInt();
        System.out.println(select1);

    }
}
