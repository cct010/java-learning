/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-08-29
 * Time: 19:47
 */
class ListNote{
    public int val;
    public ListNote prev;
    public ListNote next;

    public ListNote(int val)  {
        this.val = val;
    }
}
public class MyLinkedList {
    public ListNote head;
    public ListNote last;
    public void display(){
        ListNote cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public int size(){
        ListNote cur = this.head;
        int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public boolean contains(int key){
        ListNote cur = this.head;
        while(cur!=null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}
