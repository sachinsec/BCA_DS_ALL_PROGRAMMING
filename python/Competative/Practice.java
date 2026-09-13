/**
 * Practice
 */

class Queuecustom{
    int [] data;
    private int end = 0;
    private  static int DEFUALT_SIZE = 10;

    public Queuecustom(){
        this(DEFUALT_SIZE);
    }
    public Queuecustom(int size){
        this.data = new int[size];
    }
    public void equeue(int value){
        if (end==data.length) {
            increase();
        }
        data[end++] = value;
    }
    public int dequeue(){
        int r = data[0];
        for (int i = 0; i < end; i++) {
            data[i]=data[i+1];
        }
        end--;
        return  r;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
    }
    public void increase(){
        int [] temp = new int[end+DEFUALT_SIZE];
        for (int i = 0; i < end ; i++) {
            temp[i]=data[i];
        }
        data = new int[end+DEFUALT_SIZE];
        data=temp;
    }

}
public class Practice {

    public static void main(String[] args) {

        Queuecustom q = new Queuecustom();
        q.equeue(10);
        q.equeue(20);
        q.equeue(30);
        q.equeue(40);
        q.equeue(50);
        q.equeue(60);
        q.equeue(70);
        q.equeue(80);
        q.equeue(90);
        q.equeue(100);
        q.equeue(110);
        q.equeue(10);
        q.equeue(20);
        q.equeue(30);
        q.equeue(40);
        q.equeue(50);
        q.equeue(60);
        q.equeue(70);
        q.equeue(80);
        q.equeue(90);
        q.equeue(100);
        q.equeue(110);
        q.equeue(10);
        q.equeue(20);
        q.equeue(30);
        q.equeue(40);
        q.equeue(50);
        q.equeue(60);
        q.equeue(70);
        q.equeue(80);
        q.equeue(90);
        q.equeue(100);
        q.equeue(110);

        q.display();
        
    }
}