import jdk.nashorn.internal.parser.JSONParser;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-08
 * Time: 7:39
 */
//类名-大驼峰
//psvm---main
//soup ---打印，快捷键的设置
public class test {
    public static void main(String[] args) {
        short c =10;//-2^15~2^15-1
        boolean flag =true;//true or false boolean取值只有两个,jvm中并没有明确规定布尔类型的大小
        String c1 = "\"asd\"+\\hello\\";//字符串类型
        char c2 = 'a';//字符类型
        System.out.println(c1);
        System.out.println("hello"+"world");//两个字符串相加，+相当于拼接
        System.out.println("hello"+20+10);//字符串与其他数据类型使用+号拼接，结果就是一个字符串
        System.out.println(20+10+"hello");//计算器在计算的时候从左往右看，就计算20+10，再拼接“hello”
        System.out.println("hello"+(10+20));
        System.out.println(10+""+20+"hello");
    }
}
