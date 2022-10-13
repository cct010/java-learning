import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-11
 * Time: 17:29
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;
    //构造函数
    public TestHeap() {
        this.elem = new int[10];
    }
    public void createHeap(int[] array){
        for (int i = 0;i<array.length;i++){
            elem[i] = array[i];
            usedSize++;
        }
        for (int parent = (usedSize-1-1)/2;parent>=0;parent--){
            //向下调整
            shiftDown(parent,usedSize);
        }
    }
    //向下调整函数
    public void shiftDown(int parent ,int len){
        int child = parent*2+1;
        while(child<len){
            if(child +1<len&&elem[child]<elem[child+1]){
                child++;
            }
            if(elem[child]>elem[parent]){
                swap(elem,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }
    //交换函数
    public void swap(int[] array,int i,int j){
        int tmp = array[i];
        array[i]=array[j];
        array[j]=tmp;
    }
    //入队 向上调整
    public boolean isFull(){
        return usedSize == elem.length;
    }
    public void off(int val){
        if (isFull()){
            //扩容
            elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize++]=val;
        shiftUp(usedSize-1);
    }
    private void shiftUp(int child){
        int parent = (child-1)/2;
        while(child>0){
            if (elem[child]>elem[parent]){
                swap(elem,parent,child);
                child =parent;
                parent = (child-1)/2;
            }
            else {
                break;
            }
        }
    }
    //出队
    public boolean isEmpty(){
        return usedSize == 0;
    }
    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int tmp = elem[0];
        swap(elem,0,usedSize-1);
        usedSize--;
        shiftDown(0,usedSize);
        return tmp;
    }


}
