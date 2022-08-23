/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-23
 * Time: 21:10
 */
public class Test {
    public static int sum(int[]x){
        int sum = 0;
        for(int i:x){
            sum =sum + i ;
        }
        return sum;
    }
    public static double avg(int[] x){
        int sum = 0;
        for(int i:x){
            sum =sum + i ;
        }
        int l = x.length;
        double s = sum*1.0/l;
        return s;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        double s = avg(a);
    }
}
