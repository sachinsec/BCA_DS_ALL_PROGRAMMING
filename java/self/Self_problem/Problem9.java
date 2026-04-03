/*12.	Create abstract class Shape:
•	abstract method area()
•	implement in Circle and Rectangle
 */
abstract class Shape{
   public abstract double area();
}
class Circle extends Shape{
    double r;
   Circle(double r){
     this.r=r;
   }
    public double area(){
        return (3.14*r*r);
    }
}
class Rectangle extends Shape{
    double l,b;
    Rectangle(double b, double l){
       this.b=b;
       this.l=l;
    }
    public double area(){
        return l*b;
    }
}

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Hello I am abtract problem.");
        Circle obj=new Circle(2);
        Rectangle obj1=new Rectangle(5, 3);
      System.out.println(obj.area());  
      System.out.println(obj1.area());  
    }
}
