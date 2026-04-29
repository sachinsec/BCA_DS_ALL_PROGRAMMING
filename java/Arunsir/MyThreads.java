import java.lang.Thread;
class a extends Thread{
    public void run(){
        for (int i = 0; i <= 5; i++) {
             System.out.println("Thread A");
        }
        System.out.println("Thread A Exit");
    }
}

class b extends Thread{
    public void run(){
        for (int i = 0; i <= 4; i++) {
             System.out.println("Thread B");
        }
        System.out.println("Thread B Exit");
    }
}

class c extends Thread{
    public void run(){
       for (int i = 0; i <= 3; i++) {
             System.out.println("Thread C");
        }
        System.out.println("Thread C Exit");
    }
}
public class MyThreads {

    public static void main(String[] args) {
        a t1 = new a();
        b t2 = new b();
        c t3 = new c();

        t1.start();
        t2.start();
        t3.start();

        
    }
}