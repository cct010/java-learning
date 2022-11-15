import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-11-04
 * Time: 19:49
 */
class Student{
    private String name = "hh";
    public int age =18;

    
    public Student() {
        System.out.println("我的名字叫？");
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我的名字叫 "+name+"我才不告诉你我"+age+"岁！");
    }
    private void eat(){
        System.out.println("你没看见我正在吃饭嘛？");
    }
    public void sleep(){
        System.out.println("好啦！我要睡觉了！");
    }
    private void function(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = Class.forName("Student");
        Class<?> c2 = Student.class;
        Student student = new Student();
        Class<?> c3 = student.getClass();
        System.out.println(c3.equals(c2));
        
    }
}
