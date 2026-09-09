class Node{
    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}
class Mystack{
    Node head;
    int size;
    public void push(int value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
    public int peek(){
        
        return head.value;
    }
    public int pop(){
        int v = head.value;
        head = head.next;
        return v;
    }
}
public class StackImp {

    public static void main(String[] args) {
        Mystack s = new Mystack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        s.display();
        
    }
}