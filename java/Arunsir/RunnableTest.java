class Demo implements Runnable{
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("Thread Demo:"+i);
        }
        System.out.println("Exit Thread Demo");
    }
}

class Demo1 implements Runnable{
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("Thread Demo1:"+i);
        }
        System.out.println("Exit Thread Demo1");
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo1 d1 = new Demo1();
        
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d1);

        t1.start();
        t2.start();
    
    }
}
