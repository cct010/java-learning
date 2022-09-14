/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-14
 * Time: 18:49
 */
import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        //write your code here......
        String[] str1 = str.split("@");
        String[] ss = new String[2];
        int size = str1.length;
        if(str1[0].equals("")){
            System.out.println("邮箱格式不合法");
        }
        else if(size!=2){
            System.out.println("邮箱格式不合法");
        }
        else{
            ss = str1[1].split("\\.");
            size = ss.length;
            if(size!=2){
                System.out.println("邮箱格式不合法");
            }
            else{
                int flag =0;
                char[] chars = ss[0].toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if( (c <= '9' && c>='0' )||(c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                        ;
                    }
                    else{
                        flag =1;
                        break;
                    }
                }
                chars = ss[1].toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if( (c <= '9' && c>='0' )||(c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                        ;
                    }
                    else{
                        flag =flag+1;
                        break;
                    }
                }
                chars = str1[0].toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if( (c <= '9' && c>='0' )||(c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                        ;
                    }
                    else{
                        flag =flag+1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println("邮箱格式合法");
                }
                else{
                    System.out.println("邮箱格式不合法");
                }
            }
        }

        //ystem.out.println(flag);


    }

    public static void main(String[] args) {
        //boolean  b  = "abc".matches("[a-z]{3}";
        //System.out.println(b);
        boolean b1 = "abc".matches("[a-z]{3}");
        //System.out.println(b1);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        if(str.matches(emailMatcher)){
            System.out.println("邮箱格式合法");
        }else{
            System.out.println("邮箱格式不合法");
        }
    }
}
