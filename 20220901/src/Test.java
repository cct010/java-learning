/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-01
 * Time: 20:49
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        l1.addFirst(5);
        l1.addFirst(9);
        l1.addLast(13);
        l1.addLast(89);
        l1.display();
        l1.delete(5);
        l1.display();
        l1.delete(99);
        l1.display();
        l1.creatList();
        l1.display();
    }
}
