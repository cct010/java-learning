/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-24
 * Time: 21:07
 */
public class Main {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        boolean b = mystack.empty();
        mystack.push(3);
        mystack.push(4);
        mystack.push(7);
        mystack.push(9);
        System.out.println(b);
        System.out.println(mystack.top());
    }
}
