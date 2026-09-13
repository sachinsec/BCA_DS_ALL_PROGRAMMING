class Myqueue{
    int[] value;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Myqueue(){
        this(DEFAULT_SIZE);
    }
    public Myqueue(int size){
         this.value = new int[size];
    }

    public void insert(int data){
       value[size++]=data;
    }
}
public class Queueimple{
    public static void main(String[] args) {
        
    }
}