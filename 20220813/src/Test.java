import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-13
 * Time: 7:28
 */
public class Test {
    public static void Comp(int n) {

    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        while(scanner.hasNext()){
            int rand = random.nextInt(100);
            while(true){
                //System.out.println("请输入要猜的数字");
                int n = scanner.nextInt();
                if(n<rand){
                    System.out.println("猜小了");
                }
                else if(n>rand){
                    System.out.println("猜大了");
                }
                else{
                    System.out.println("恭喜你，猜对了！");
                    System.out.println("开始新一轮的猜数字游戏！");
                    break;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random =new Random();
        int rand = random.nextInt(100);
        while(true){
            System.out.println("请输入要猜的数字");
            int n = scanner.nextInt();
            if(n<rand){
                System.out.println("猜小了");
            }
            else if(n>rand){
                System.out.println("猜大了");
            }
            else{
                System.out.println("恭喜你，猜对了！");
                break;
            }

        }
    }
}
