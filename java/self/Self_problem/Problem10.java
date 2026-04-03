/*13.	Create abstract class Vehicle:
•	method start()
•	implement in Car and Bike
 */

abstract class Vehicle{
    public abstract void start();
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car has started.");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike has started.");
    }
}
public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Hello I am problem10");
        Vehicle obj=new Bike();
        Vehicle obj1=new Car();
        obj.start();
        obj1.start();
    }
}
