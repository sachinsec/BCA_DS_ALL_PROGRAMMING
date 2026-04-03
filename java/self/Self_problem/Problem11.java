/*14.	Create interface Animal:
•	method eat()
•	implement in Dog, Cat
 */
interface Animal {
public void eat();    
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating...");
    }
}
class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating....");
    }
}

public class Problem11 {
    public static void main(String[] args) {
        System.out.println("I am problem 11");
        Animal obj = new Cat();
        Animal obj1 = new Dog();
        obj.eat();
        obj1.eat();
    }
}
