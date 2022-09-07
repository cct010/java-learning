/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-07
 * Time: 19:15
 */
public class Test {
    public static void Flying(IFlying iFlying){
        iFlying.Fly();
    }
    public static void Eat(Animal animal){
        animal.eat();;
    }
    public static void main(String[] args){

        Flying(new Bird("hehe",19));
        Eat(new Bird("haha",19));
    }
}
