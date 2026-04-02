/*Create a Car class:

attributes: brand, model, price
method to print car info */

class Car{
    float price;
    String Model,brand;
    Car(float price,String Model,String brand){
        this.Model=Model;
        this.brand=brand;
        this.price=price;
    }
    public void display(){
        System.out.println("Brand: "+brand+"\nModel: "+Model+"\nPrice: $"+price);
    }

}
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("############## __Car INfo__ ##############");
        Car obj = new Car(102358.5f,"2026 Tesla Model Y","Tesla");
        obj.display();

    }
}
