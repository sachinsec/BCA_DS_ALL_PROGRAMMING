/*Create a Rectangle class:
calculate area and perimeter */
class Rectangle{
    double b,l;
Rectangle(double l,double b){
       this.l=l;
       this.b=b;
}
public double getArea(){
    return  l*b;
}
public double getPerimeter(){
    return 2+(l+b);
}
public void display(){
    System.out.println("Area of Recatangle: "+getArea()+"\nPerimeter of rectangle: "+getPerimeter());
}
}
public class Problem2 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(9.2, 7.3);
        Rectangle obj1=new Rectangle(9, 7);
        obj.b=0;
        obj.display();
        obj1.display();
    }
}
