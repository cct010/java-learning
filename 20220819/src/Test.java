/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-19
 * Time: 20:21
 */
class Cac{
    private int num1;
    private int num2;
    public  int val;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum(){
        return num1+num2;
    }




}
public class Test {
    public static  void Swap(Cac v1,Cac v2) {
        int tmp = v1.val;
        v1.val = v2.val;
        v2.val = tmp;
    }

    public static void main(String[] args) {
        Cac cac = new Cac();
        cac.setNum1(2);
        cac.setNum2(3);
        System.out.println(cac.sum());
        Cac myval1 = new Cac();
        myval1.val = 10;
        Cac myval2 = new Cac();
        myval2.val = 30;
        Swap(myval1,myval2);
        System.out.println(myval1.val+" "+myval2.val);
    }
}
