/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-06
 * Time: 19:45
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.name = "hehe";
        animal.eat();
        Animal animal1 = new Bird();
        if(animal1 instanceof Bird){
            Bird bird = (Bird) animal1;
            bird.name = "bebe";
            bird.fly();
        }
    }
}
