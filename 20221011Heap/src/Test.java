import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-11
 * Time: 17:29
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(34);
        priorityQueue.offer(32);
        priorityQueue.offer(9);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
