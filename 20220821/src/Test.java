import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-21
 * Time: 19:36
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =3;
        while(count!=0){
            System.out.println("请输入你的密码：");
            String password = scanner.nextLine();
            if(password.equals("123456")){
                System.out.println("登录成功了!");
                break;
            }
            else {
                count--;
                System.out.println("你输入错误，你还有的机会次数："+count);
            }
        }
    }
}
