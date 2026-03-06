abstract class parent{
    public void parent(){
        System.out.println("I'm a constractor of base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("Good morning");
    }
}
class child1 extends parent{

    public void greet(){
        System.out.println("Good Afternoon");
    }
}
public class ch11_abstract {

    public static void main(String[] args) {
       //  parent p = new parent(); we can't create object of the abstract class.
        child c = new child();
        child1 c1 = new child1();
        c.greet();
        c1.greet();
        c.sayHello();
        //child1 c1 = new child1();

    }
}