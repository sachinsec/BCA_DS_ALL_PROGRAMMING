class Mythr2 extends Thread{
    public void run(){
        int i =0;
        while (i<100) {
            System.out.println("Thanks you 1");
             i++;
        }
       
    }
}
class Mythr3 extends Thread{
    public void run(){
        int i =0;
        while (i<100) {
            System.out.println("Thanks you 2");
            i++;
        }
        
    }
}
public class ch13_Java_Threads_method {
    public static void main(String[] args) {
        System.out.println("I am java Thread method.");
        Mythr2 t1 = new Mythr2();
        Mythr3 t2 = new Mythr3();
        t1.start();
        try {
              t1.join();
            
        } catch (Exception e) {
            System.out.println(e);
        }
      

        t2.start();
    }
}
