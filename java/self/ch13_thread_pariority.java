class MyThr1 extends Thread{
    public MyThr1(String name ){
        super(name);
    }
    public void run(){
        int i = 10;
        while (true) {
             System.out.println("Thanksyou! "+this.getName());
        }
       
    }
}

public class ch13_thread_pariority {
    public static void main(String[] args) {
        System.out.println("Threads priroity");
        MyThr1 t1 = new MyThr1("Sachin");
        MyThr1 t2 = new MyThr1("Arjun");
        MyThr1 t3 = new MyThr1("MOhit");
        MyThr1 t4 = new MyThr1("Krishnveer");

        t1.setPriority(Thread.MAX_PRIORITY); // For set max priority of threads  
        t4.setPriority(Thread.MIN_PRIORITY); // For set Min priority of threads
        t2.setPriority(Thread.MIN_PRIORITY); // For set Min priority of threads
        t3.setPriority(Thread.MIN_PRIORITY); // For set Min priority of threads

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
