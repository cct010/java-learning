import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-11
 * Time: 6:41
 */
public class Test {
    public static int numAdd(int n) {
        int j=2;
        for(;j<=Math.sqrt(n);j++){
            if (n%j ==0) {
                return 0;

            }
        }
        return 1;
        //if(j>Math.sqrt(n)){
        //    return 1;
            //System.out.println(n+"是素数！");
        //}
    }
    public static void main(String[] args) {
       int sum=0;
       int i=0;
        while (i<=100){
            if(i%15==0){
                System.out.println(i);
            }
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = numAdd(n);
        if(ret==0){
            System.out.println(n + "不是素数！");
        }
        else{
            System.out.println(n + "是素数！");
        }

    }
}
