class Node{
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}

class MyLinkedlist{
    Node head;
    Node tail;
    int size=0;
 
    public void addAthead(int value){
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
        }
        else{
            temp.next = head;
            head = temp ;
        }
        size++;

    }

    public void addAttail(int va){
        Node temp = new Node(va);
        if (head == null) {
            head = tail =temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public  void display(){
        Node temp = head;
        if (head == null) {
            return ;
        }
        while (temp != null) {
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
    }
    public int deletehead()throws Exception{
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        int r =  head.value;
        head = head.next;
        return  r;

    }

    public  int deleteindex(int idx){
        Node temp  = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        int r =  temp.next.value;
        temp.next = temp.next.next;
        return r;

    }
    public void insertindx(int value,int index){
        Node temp = head;
        if (head == null) {
            addAthead(value);
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        
        Node t = new Node(value);

        t.next =temp.next;
        temp.next = t;
        size++;
    }

}

public class customLinked {

    public static void main(String[] args) throws Exception{

        MyLinkedlist list =new MyLinkedlist();
        list.addAttail(10);
        list.addAttail(20);
        list.addAttail(30);
        list.addAttail(40);
        
        list.insertindx(50,1);
        
        list.display();
        
    }
}