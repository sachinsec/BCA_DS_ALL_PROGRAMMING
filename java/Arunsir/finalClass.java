class Finala{
final int num;
int num2;
public Finala(int n){
    this.num=n;
    this.num2=200;
}
final void calculate(){
    num2=num2+10;
}
final void getdata(){

}
void putdata(){

}
public void display(){
    System.out.println("This is a method in the final class.");
    System.out.println("The value of the final varialble is : "+num);
    System.out.println("The value of num2: "+num2);
}
}
class b extends Finala{
    int x;
    public b(int n, int y){
        super(n);
     //   super.num=2; // because num is a final varialbe so we can't change the value of this.
        super.num2=3;
        this.x=y;
    }
   //void getdata(){
   //    We can't override final methods
   //}
   void putdata(){
    // we can access easily 
   }
}
public class finalClass {
    public static void main(String[] args) {
        System.out.println("Hello Final keyword");

        Finala obj = new Finala(2);
       // obj.num=2;  we can't change because this is final
       
    }
}
