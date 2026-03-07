/* Run-Time Polymorphism (Method Overriding) */
class animal{
    public void display(){
        System.out.println("Animal sound....");
    }
}
class dog extends animal{
    public void display(){
        System.out.println("Dog barks...");
    }
}
class cat extends animal{
    public void display(){
        System.out.println("Mewwww....");
    }
}
public class ch11_polymorism {
    public static void main(String[] args) {
        animal ob = new dog();
        ob.display();
        ob=new cat();
        ob.display();
        
    }
}
