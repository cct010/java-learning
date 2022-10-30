import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-30
 * Time: 20:34
 */
class Person{
    public String ID;
    public Person(String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
public class HashBuck2<K,V> {
    //静态内部类
    static class Node<K,V> {
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node<K,V>[] array = (Node<K, V>[])new Node[10];
    public int usedSize;
    public void put(K key,V val){
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while (cur!=null){
            if(cur.key.equals(key)){
                cur.val= val;
                return;
            }
            cur = cur.next;
        }
        Node<K,V> node = new Node<>(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
    }
    public V get(K key){
        int hash = key.hashCode();
        int index = hash%array.length;
        Node<K,V> cur = array[index];
        while (cur!=null){
            if(cur.key.equals(key)){
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
}

