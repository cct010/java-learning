/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-16
 * Time: 6:31
 */
public class Test {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        else{
            return sum(n-1)+n;
        }
    }

    public static int Print(int n) {
        if(n<=9)
            return n;
        else{
            System.out.print(n%10+" ");
            return Print(n/10);
        }
    }
    public static void Print1(int n) {
        if(n<=9)
            System.out.print(n%10+" ");
        else{
            Print1(n/10);
            System.out.print(n%10+" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
        System.out.println(Print(23456));
        Print1(23456);
    }
}
