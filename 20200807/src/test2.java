import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-07
 * Time: 15:55
 */
//public:访问修饰限定符
//class:关键字，定义一个类,类型【抽象的】
//java中main函数的固定写法：public static void main(String[] args)｛｝
//函数也称为方法
// 如果这个类是public修饰的，这个类名必须与文件名一致
//一个类对应一个字节码（.class）
//方法写在类里
//int 4个字节 java中没有所谓的无符号型，统一是有符号的，取值范围-2^31~2^31-1
//变量的命名：数字，字母，下划线，美元符号组成，不能以数字开头 例子：maxNum，max_num,max$num,nax3_num
//变量未初始化就使用就报错
//long 长整型 8个字节 64个bit位，第一位符号位，取值范围：-2^63~2^63-1
//double  8 字节
public class test2 {
    public static void main(String[] args) {
        int a =11;
        float b1 = 12.4F;//表示他是单精度的数字，不然会报错
        long b = 10L;//10后面的L表示b为长整型，Java中不存在long long 类型
        double a1 =1.2;
        char ch ='a';//java中的char是2字节,可以赋值为中文
        char ch1 = 97;//也会转化成它对应的字符
        byte b2 =10;//字节类型，占一个字节 取值范围：-128~127
        short c1 =10;//短整型 ，2个字节，取值范围： -2^16~2^16-1
        System.out.println(a1*a1);
        System.out.print("打印不换行");
        System.out.println("打印换行");//用很多
        System.out.printf("%d\n",a);//基本不用
        short c =10;//-2^15~2^15-1
        boolean flag =true;//true or false boolean取值只有两个,jvm中并没有明确规定布尔类型的大小
        String c11 = "\"asd\"+\\hello\\";//字符串类型
        char c2 = 'a';//字符类型
        System.out.println(c11);
        System.out.println("hello"+"world");//两个字符串相加，+相当于拼接
        System.out.println("hello"+20+10);//字符串与其他数据类型使用+号拼接，结果就是一个字符串
        System.out.println(20+10+"hello");//计算器在计算的时候从左往右看，就计算20+10，再拼接“hello”
        System.out.println("hello"+(10+20));
        System.out.println(10+""+20+"hello");
        String str = "123";
        int ret = Integer.valueOf(str);
        System.out.println(ret);
        int num = 113;
        String ret1 = String.valueOf(num);
        System.out.println(ret1);
        Scanner scanner = new Scanner(System.in);
        //java本身就不是用来开发控制台程序的。
        int n =scanner.nextInt();
        if(n%2 ==0) {
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
