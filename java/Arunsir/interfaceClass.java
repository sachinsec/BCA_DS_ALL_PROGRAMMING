interface employee{
    void sound();
}
class programmer implements employee{
    public void sound(){
        System.out.println("Hello I am interface. ");
    }
}
public class interfaceClass {
    public static void main(String[] args) {
        System.out.println("Hello INterface");

    }
}
