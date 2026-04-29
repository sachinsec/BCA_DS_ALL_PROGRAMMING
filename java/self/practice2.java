class printing extends Thread{
public void run(){
    while (true) {
        
    System.out.println("Printing.....");
    }
}
}
class typing extends Thread{
public void run(){
     while (true) {
            System.out.println("Typing.....");
        }
}
}
class music extends Thread{
    public void run(){
        while (true) {
            System.out.println("Playing music");
        }
        
    }
}
public class practice2 {

    public static void main(String[] args) {
        Thread obj = new typing();
        Thread obj1 = new music();
        Thread obj2 = new printing();
        obj.start();
        obj1.start();
        obj2.start();
       
    }

}