/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-04
 * Time: 19:50
 */
 class Animal {
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+" eat()");
    }
}
class Dog extends Animal{
     public int len;

}
class Bird extends Animal{
     public String wing;
     public void fly(){
         System.out.println(name+" fly()");
     }
}
