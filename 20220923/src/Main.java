/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-23
 * Time: 20:00
 */
public class Main {
    public static void main(String[] args) {
        Myqueue myqueue = new Myqueue();
        myqueue.offer(2);
        myqueue.offer(4);
        myqueue.offer(8);
        myqueue.offer(1);
        System.out.println(myqueue.peek());
    }
}
