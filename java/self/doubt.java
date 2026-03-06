import java.util.Scanner;
class parent{
    public void display(){
        System.out.println("I'm parents class");
    }
}
class child extends parent{
    public void display(){
        System.out.println("I'm child class");
    }
}
class child1 extends parent{
    public void display(){
        System.out.println("I'm child1 class");
    }
}
public class doubt {
    public static void main(String[] args) {
        child c = new child();
        child1 c1 = new child1();
        c1.display();
        c.display();

    }
}
