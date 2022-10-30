/**
 * Created with IntelliJ IDEA.
 * Description
 * User: Administrator
 * Date: 2022-10-30
 * Time: 20:50
 */
public class Main {
    public static void main(String[] args) {
        Person person1= new Person("123");
        Person person2 = new Person("123");
        HashBuck2<Person,String> hashBuck2 = new HashBuck2<>();
        hashBuck2.put(person1,"hello");
        System.out.println(hashBuck2.get(person2));
    }
}
