class music implements Runnable{
  public void run(){
    for (int i = 0; i < 10; i++) {
            System.out.println("Hello I am runnable music.. ...");
    }

  }
}
class typing implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello I am runnable Typing........");
        }
        
    }
}
public class prectice12 {

    public static void main(String[] args) {
       music r1 = new music();
       typing r2 = new typing();

       Thread t1 = new Thread(r1);
       Thread t2 = new Thread(r2);

       t1.start();
       t2.start();

    }
}