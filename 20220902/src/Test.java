/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-02
 * Time: 20:48
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
        int a = l1.size();
        System.out.print("链表长度是： "+a);
        System.out.println();
        l1.addIndex(5,90);
        l1.display();
    }
}
