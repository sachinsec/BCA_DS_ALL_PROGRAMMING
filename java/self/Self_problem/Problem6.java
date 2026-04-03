/*8.	Overload a method add():
o	add(int a, int b)
o	add(double a, double b)
 */
class Overload{
 public void add(int a,int b){
    System.out.println("Sum: "+(a+b));
 }
 public void add(double a, double b){
    System.out.println("Sum: "+(a+b));
 }
}
public class Problem6 {
    public static void main(String[] args) {
        System.out.println("I am problem number 6.");
        Overload obj=new Overload();
        obj.add(2,3);
        obj.add(2.3,3.2);
    }
}
