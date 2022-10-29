import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-25
 * Time: 19:26
 */
public class Main {
    public static Map<Integer,Integer> func1(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int x:array){
            if(map.get(x) == null){
                map.put(x,1);
            }
            else {
                int val = map.get(x);
                map.put(x,val+1);
            }
        }
        return  map;
    }
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for(int i =0;i< array.length;i++){
            array[i] = random.nextInt(100);
        }
        Map<Integer,Integer> map = func1(array);
        System.out.println(map);
    }
}
