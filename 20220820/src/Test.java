/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-20
 * Time: 20:23
 */
public class Test {
    public static  int Flowers(int n){
        int t = n;
        double x;
        double sum=0.0;
        while(t!=0){
            x= Math.pow(t%10,3);
            sum = sum + x;
            t= t/10;
        }
        if((sum -n)<Math.abs(0.000001)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int i=0;
        int flag=1;
        double sum=0;
        for(i=101;i<1000;i+=2){
            //打印水仙花数
            if(Flowers(i)==1){
                System.out.print(i+" ");
            }
        }
        for(i=1;i<101;i++){
            sum = sum + flag*(1.0/i);
            flag = -flag;
        }
        System.out.println();
        System.out.println(sum);
    }
}
