import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-20
 * Time: 18:42
 */
public class Main {
    public static  List<List<Integer>> generate (int numRows){
        List <List<Integer>> ret = new ArrayList<>();
        List <Integer> list1 = new ArrayList<>();
        list1.add(1);
        ret.add(list1);
        for(int i =1;i<numRows;i++){
            List <Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> preRow = ret.get(i-1);
            for(int j =1;j<i;j++){
                int num1 = preRow.get(j)+preRow.get(j-1);
                list.add(num1);
            }
            list.add(1);
            ret.add(list);
        }
        return ret;
    }
    public static void main(String[] args) {
        List <List<Integer>> list = new ArrayList<>();
         list = generate(8);
        //list.add(1);
        //list.add(1);
        //
        System.out.println(list);
    }

}
