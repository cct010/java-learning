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
public class Test {
    //topK问题
    public static int[] topK(int[] array,int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size()<k){
                maxHeap.offer(array[i]);//小于k就放入元素
            }
            else {
                int top = maxHeap.peek();
                if(top > array[i]){
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        int[] tmp = new int[k];
        for(int i =0;i<k;i++){
            tmp[i] = maxHeap.poll();
        }
        return tmp;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(34);
        priorityQueue.offer(32);
        priorityQueue.offer(9);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        int[] array = {2,3,4,55,67,8,90,12,34,99,544,87};
        int[] array1 = topK(array,4);
        System.out.println("topK选取前K个小的元素：");
        for(int x = 0;x<array1.length;x++){
            System.out.print(array1[x]+" ");
        }
        //System.out.println(Arrays.toString(array1));
        System.out.println("\n堆出队：");
        TestHeap testHeap = new TestHeap();
        testHeap.off(12);
        testHeap.off(45);
        testHeap.off(6);
        testHeap.off(77);
        int t = testHeap.poll();
        System.out.println(t);

    }
}
