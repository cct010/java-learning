/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-30
 * Time: 19:49
 */
class List{
    public int val;
    public List next;
    public List(int val){
        this.val = val;
    }
}
public class LinkedList {
    public List head;
    public void createList(){
        List l1 = new List(5);
        List l2 = new List(6);
        List l3 = new List(7);
        List l4 = new List(7);
        List l5 = new List(6);
        List l6= new List(5);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        this.head = l1;
    }
    public void dispay(){
        List cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public boolean Loop(){
        //链表的回文结构
        List fast = this.head;
        List slow = this.head;
        List curNext = this.head;
        List cur = this.head;
        if(this.head == null){
            return true;
        }
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        cur = slow.next;
        while(cur!= null){
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        List headA = this.head;
        while(headA != slow) {
            if(headA.val != slow.val){
                return false;
            }
            if(headA.next == slow){
                return true;
            }
            headA = headA.next;
            slow = slow.next;
        }
        return true;
    }
}
