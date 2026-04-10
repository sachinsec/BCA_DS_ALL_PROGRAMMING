class MyThreads extends Thread{
   public void run(){
    int i=0;
        while (i<40000) {
          System.out.println("My threads are running");
         System.out.println("I am happy");  
         i++;
        }
         
    }

}
class MyThreads2 extends Thread{
  public void run(){
    int i=0;
    while (i<40000) {
         System.out.println("Thread 2 is good");
    System.out.println("I am sad!");
    i++;
    }
  }
}
public class ch13_threading_by_Extending {
    public static void main(String[] args) {
        System.out.println("I am multthreading.");
        MyThreads t1= new MyThreads();
        MyThreads2 t2 = new MyThreads2();
        t1.start();
        t2.start();
    }
}
