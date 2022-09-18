/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-17
 * Time: 20:33
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            Base h =new Sub();
            int c =h.sum(a,b);
            System.out.println(c);
        }
    }
}
class Base {
    int x;
    int y;

    public void get(int x,int y){
        this.y = y;
        this.x =x;
    }
    public int sum(int x,int y){
        return x+y;
    }
    public Base(){
        this.x =x;
        this.y =y;
    }

}
class Sub extends Base{

    public Sub(){
        super();
    }
    public void get(int x,int y){
        this.x =x;
        this.y =y;
    }
    public int sum(int x,int y){
        int c =x*10+y;
        return c;
    }
}
