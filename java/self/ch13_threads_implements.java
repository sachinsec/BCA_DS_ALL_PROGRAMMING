class MyThreadsRunnable1 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("I am a thread 1 not a threat 1");
        }
        
    }
}
class MyThreadsRunnable2 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}

public class ch13_threads_implements {
    public static void main(String[] args) {
        
        MyThreadsRunnable1 bullet1= new MyThreadsRunnable1();
        MyThreadsRunnable2 bullet2=new MyThreadsRunnable2();
        Thread gun1= new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
