/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-28
 * Time: 10:31
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
    public boolean contains(int key){
        List cur = this.head;
        while(cur!=null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int size(){
        List cur = this.head;
        int size =0;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }
    public void addFirst(int data){
        //头插法
        List note = new List(data);
        note.next = this.head;
        this.head = note;
    }
    public void addLast(int data){
        List note = new List(data);
        if(this.head == null){
            this.head = note;
        }
        else{
            List cur = this.head;
            while(cur!=null){
                cur = cur.next;
            }
            cur.next = note;
        }
    }

}
