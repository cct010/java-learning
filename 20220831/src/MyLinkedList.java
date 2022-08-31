/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-31
 * Time: 19:50
 */
class ListNote{
    public int val;
    public ListNote prev;
    public ListNote next;
    public ListNote(int val){
        this.val = val;
    }
}
public class MyLinkedList {
    public ListNote head;
    public ListNote last;
    public void display(){
        ListNote cur = this.head;
        while(cur!=null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        //头插法
        ListNote cur = new ListNote(data);
        if(this.head == null){
            this.head = cur;
            this.last = cur;
        }
        else{
            cur.next = this.head;
            this.head.prev = cur;
            this.head = cur;
        }
    }
    public void addLast(int data){
        //尾插法
        ListNote cur = new ListNote(data);
        if(this.head == null){
            this.head = cur;
            this.last = cur;
        }
        else{
            this.last.next = cur;
            cur.prev = this.last;
            this.last = cur;
        }
    }
    public void delete(int key){
        ListNote cur = this.head;
        int flag = 0;
        while(cur != null)
        {
            if(cur.val == key){
                flag = 1;
                if(cur == this.head){
                    this.head = this.head.next;
                    head.prev = null;
                }
                else{
                    cur.prev.next = cur.next;
                    if(cur == last){
                        this.last = this.last.prev;
                    }
                    else{
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
        if(flag == 0){
            System.out.println("输入数字不存在！");
        }
    }
}
