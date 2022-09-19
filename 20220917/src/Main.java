/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-17
 * Time: 20:33
 */
import java.util.List;
import java.util.Scanner;
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            Base h =new Sub();
            int c =h.sum(a,b);
            System.out.println(c);
        }
    }
}
class Base {
    int x;
    int y;

    public void get(int x,int y){
        this.y = y;
        this.x =x;
    }
    public int sum(int x,int y){
        return x+y;
    }
    public Base(){
        this.x =x;
        this.y =y;
    }

}
class Sub extends Base{

    public Sub(){
        super();
    }
    public void get(int x,int y){
        this.x =x;
        this.y =y;
    }
    public int sum(int x,int y){
        int c =x*10+y;
        return c;
    }
}
/*
class Employee {
    public:
    int id;
    int importance;
    vector<int> subordinates;
};
class Solution {
    //方法1：普通递归，思路最简单，一看到题目就能想到
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            if (e.id == id) {
                if (e.subordinates.size() == 0) {  // 没有子结点
                    return e.importance;
                }
                for (int subId: e.subordinates) {
                    e.importance += getImportance(employees, subId);
                }
                return e.importance;
            }
        }
        return 0;
    }
    */

    /* 方法2：递归 + Map优化  每次递归时都遍历employees进行线性查找，可用map存储employee进行查询优化
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e: employees) {
            map.put(e.id, e);
        }
        return getImportanceHelper(map, id);
    }

    public int getImportanceHelper(Map<Integer, Employee> map, int id) {
        Employee employee = map.get(id);
        for (int subId: employee.subordinates) {
            employee.importance += getImportanceHelper(map, subId);
        }
        return employee.importance;
    }
    */

//}
