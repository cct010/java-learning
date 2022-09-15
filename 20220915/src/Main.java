import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-15
 * Time: 7:25
 */
public class Main {
    public static void main1(String[] args) {
        long s =0;
        long su =0;
        for(int i =0;i<10;i++){
            s = s*10+9;
            su =su+s;
           // System.out.println(s);
        }
        System.out.println(su);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int max = scanner.nextInt();
        //int max1 = scanner.nextInt();
        //int max2 = scanner.nextInt();
        while(true){
            int i = scanner.nextInt();
            if(i<=0){
                scanner.close();
                break;
            }
            max ++;
        }
        System.out.println(max);
        //System.out.println(max+"后面是"+max1);
    }
    public static int getCM(int m, int n){

        //write your code here......
        int l = m;
        int k = n;
        int r =1 ;
        if(l<k){
            int t = l;
            l = k;
            k = t;
        }
        int flag =0;
        int j = l-k;
        int c;
        while(k%j!=0){
            r = k%j;
            j = r;
        }
        if(k==j)
            j=1;
        c = l*k/j;;
        return c;

    }
}
