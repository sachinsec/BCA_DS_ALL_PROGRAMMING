class MyThr extends Thread{
    public MyThr(String name){
              super(name);
    }
    public void run(){
      //  while (true) {
      //      System.out.println("I am Threads");
      //  }
    }
}
public class ch13_threads_constractor {
    public static void main(String[] args) {
     //   System.out.println("Hello I am Thread constractor");
        MyThr t1 = new MyThr("Sachin");
        MyThr t2 = new MyThr("Arjun");
        t1.start();

        System.out.println("Name is = "+t1.getName());
        System.out.println("ID is = "+t1.getId());
         System.out.println("Name is = "+t2.getName());
        System.out.println("ID is = "+t2.getId());
    }
}
