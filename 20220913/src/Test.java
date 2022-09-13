import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-13
 * Time: 19:31
 */
public class Test {
    public static void main(String[] args) {
        String str = "abcde";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
        System.out.println(classFile);
        for(int i=1;i<8;i++){
            if(i/2==1){
                System.out.println("     **");
            }
            if(i/2==2){
                System.out.println("************");
            }
            if(i/2==3){
                System.out.println("    *  *");
            }
        }
    }
}
