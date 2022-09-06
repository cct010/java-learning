/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-06
 * Time: 19:45
 */
class Dog extends Animal{
    public int run;
    public String name = "keke";
    public void eat(){
        System.out.println(super.name +" 狼吞虎咽eat()");
    }
}
class Bird extends Animal{
    public String wing;
    public void fly(){
        System.out.println(name+" fly()");
    }
}
public class Animal {
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+" eat()");
    }
}
