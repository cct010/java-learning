/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-22
 * Time: 20:57
 */
class Testone{
    public int Max(int n,int m){
        return (n>m)?n:m;
    }
    public int Max(int n,int m , int x){
        return (Max(n,m)>x)?Max(n,m):x;

    }
    public int Sum(int x,int y){
        return x+y;
    }
    public double Sum(double x,double y,double z){
        return x+y+z;
    }
}
public class Test {
    public static void main(String[] args) {
        Testone T = new Testone();
        int x = T.Max(2,6,9);
        int y = T.Sum(2,4);
        double z = T.Sum(2.5,6.8,9.9);
        //System.out.println(x);
        System.out.println("y = "+y+" z = "+z);
    }
}
