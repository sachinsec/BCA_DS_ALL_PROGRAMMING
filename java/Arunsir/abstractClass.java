abstract class employee{
    int a=10;
public void get(){
  System.out.println(a);
}
abstract void display();
}
class programmer extends employee{
public void display(){
    System.out.println("I am Programmer.");
}
}
public class abstractClass {

    public static void main(String[] args) {
        System.out.println("Hello I am abstract concept");
    }
}