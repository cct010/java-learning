import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-24
 * Time: 21:16
 */
public class Test {
    public static void  transform(int[] a){
        for(int i=0;i< a.length;i++){
            a[i] *=2;
        }
    }
    public static void printArray(int[] a){
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,76,8,9};
        printArray(a);
        transform(a);
        //System.out.print(Arrays.toString(a));


    }
}
