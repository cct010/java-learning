import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-12
 * Time: 19:14
 */


public class Test {
    public static int Fac (int n){
        int i=0;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static int Old(int n){
        if(n<=18&&n>=0){
            return 1;
        }
        else if(n<=28&&n>=19){
            return 2;
        }
        else if(n>=29&&n<=55){
            return 3;
        }
        else{
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入要画的x行数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i,j,k;
        for(i=1;i<=(n+1)/2;i++){
            for(j=1;j<=n;j++){
                if(i==j||j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(i=n/2;i>0;i--){
            for(j=1;j<=n;j++){
                if(i==j||j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main456(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        switch (Old(n)){
            case 1:
                System.out.println("少年");
                break;
            case 2:
                System.out.println("青年");
                break;
            case 3:
                System.out.println("中年");
                break;
            case 4:
                System.out.println("老年");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public static void main45(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        if(Fac(n)==1){
            System.out.println(n+"是素数");
        }
        else {
            System.out.println(n+"不是素数");
        }
    }
    public static void main1234(String[] args) {
        int i;
        for(i=1;i<=100;i++){
            if(Fac(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main123(String[] args) {
        int i=0;
        for(i=1000;i<=2000;i++){
            if((i%4==0&&i%100!=0)||(i%400==0)){
                System.out.print(i+" ");
            }
            if(i%100==0)
                System.out.println();
        }
    }
    public static void main1(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int i=0;
        int count=0;
        for(i=0;i<100;i++)
        {
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}
