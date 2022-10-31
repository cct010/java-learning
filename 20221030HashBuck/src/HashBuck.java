/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-31
 * Time: 20:33
 */
public class HashBuck {
    //静态内部类
    static class Node {
        public int key;
        public int val;
        public Node next;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array ;
    public int usedSize;
    public static final double DEFAULT_LOAD_FACTOR = 0.75;

    public HashBuck() {
        this.array = new Node[10];
    }

    public void put(int key, int val){

        int index = key % array.length;
        Node cur = array[index];
        while (cur!=null){
            if(cur.key==key){
                cur.val= val;
                return;
            }
            cur = cur.next;
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
        if(lodeFactor()>DEFAULT_LOAD_FACTOR){
            //扩容
            resize();
        }
    }
    private double lodeFactor(){
        return 1.0*usedSize/array.length;
    }
    private void resize(){
        Node[] newArray = new Node[array.length*2];
        for(int i =0;i<array.length;i++){
            Node cur = array[i];
            while (cur!=null){
                int index = cur.key%newArray.length;
                Node curNext = cur.next;
                cur.next = newArray[index];
                newArray[index]= cur;
                cur = curNext;
            }
        }
        array = newArray;
    }
    public int get(int key){
        int index = key%array.length;
        Node cur = array[index];
        while (cur!=null){
            if(cur.key==key){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
