/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-17
 * Time: 7:14
 */
public class Test {
    public static String my_toString(int[] arry) {
        if(arry == null){
            return "null";
        }
        String s ="[";
        for(int i=0;i<arry.length;i++){
            s= s+arry[i];
            if(i< arry.length-1){
                s=s+",";
            }
            else {
                s = s+"]";
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arry={1,2,3,4,5,6};
        String s = my_toString(arry);
        System.out.println(s);
    }
}
