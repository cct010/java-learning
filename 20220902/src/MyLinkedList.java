/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-02
 * Time: 20:49
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
    public void creatList(){
        ListNote l1 = new ListNote(3);
        ListNote l2 = new ListNote(5);
        ListNote l3 = new ListNote(7);
        ListNote l4 = new ListNote(9);
        ListNote l5 = new ListNote(11);

        this.head = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        this.last = l5.next;
    }
    public void display(){
        ListNote cur = this.head;
        while(cur!=null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public int size(){
        int count =0;
        ListNote cur =this.head;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
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
                    if(this.head !=null){
                        head.prev = null;
                    }
                    else{
                        this.last = null;
                    }
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
    public void clear(){

        while(this.head!= null){
            ListNote cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.last = null;
    }
    public ListNote searchTndex(int index){
        ListNote cur = this.head;
        while(index!= 0) {
            cur = cur.next;
            index --;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        ListNote node = new ListNote(data);
        if(index<0||index>size()){
            System.out.println("输入不合法！");
            return ;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        ListNote cur = searchTndex(index);
        node.next = cur.prev.next;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
}
