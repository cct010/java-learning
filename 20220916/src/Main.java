import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-15
 * Time: 20:21
 */
public class Main {
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            Sub s = new Sub(a,b);
            s.calculate(a,b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        double ft = h*Math.pow(0.5,n);
        double qc = 0;
        for(int i =1;i<n;i++){
            qc = qc+h*Math.pow(0.5,i);
        }
        qc = qc*2 +h ;
        //System.out.println(ft+"guocheng "+qc*2);
        System.out.println(String.format("%.3f", ft)+" "+String.format("%.3f", qc));
    }
}

class Base{
    public int x;
    public int y;
    public Base (int x,int y){
        this.x=x;
        this.y=y;
    }
    public void calculate(int x,int y){
        System.out.println(x*y);
        // return x*y;
    }
}
class Sub extends Base{
    public Sub(int x,int y){
        super(x,y);
    }
    public void calculate(int x,int y){
        if(y==0){
            System.out.println("Error");
            return ;
        }
        System.out.println(x/y);
    }
}