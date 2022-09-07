/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-09-07
 * Time: 19:15
 */
interface IFlying{
    //接口
    void Fly();
}
class Bird extends Animal implements IFlying{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println(name +" 正在吃饭");
    }

    @Override
    public void Fly() {
        System.out.println(name + " 正在飞");
    }
}

class Animal {
    public String name;
    public int age;
    //构造函数
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name +" eat()");
    }
}
