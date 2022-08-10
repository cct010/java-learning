import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-10
 * Time: 7:00
 */
public class Test {
    public static void main(String[] args) {
        String str = "123";
        int ret = Integer.valueOf(str);
        System.out.println(ret);
        int num = 113;
        String ret1 = String.valueOf(num);
        System.out.println(ret1);
        Scanner scanner = new Scanner(System.in);
        //java本身就不是用来开发控制台程序的。
        int n =scanner.nextInt();
        if(n%2 ==0) {
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
