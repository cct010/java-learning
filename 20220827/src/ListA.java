/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-27
 * Time: 21:44
 */
class List{
    public int val;
    public List next;
    public List(int val){
        this.val = val;
    }
}
public class ListA {
    public List head;
    public void creatList(){
        List list1 = new List(12);
        List list2 = new List(23);
        List list3 = new List(34);
        List list4 = new List(45);
        List list5 = new List(56);

        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        this.head = list1;
    }
    public void display(){
        List cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
}
