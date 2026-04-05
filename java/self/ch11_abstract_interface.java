abstract class Pen{
   abstract void write();
   abstract void refill();
}
class FountainPen  extends Pen{
    void write(){
    System.out.println("Write");
    }
    void refill(){
    System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumbping");
    }
    void bite(){
        System.out.println("Biting..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
  void speak(){
    System.out.println("Hello sir");
  }
  @Override
  public void sleep(){
      System.out.println("Sleeping.");
  }
  @Override
  public void eat(){
     System.out.println("Eating");
  }
}
public class ch11_abstract_interface {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human harry = new Human();
        harry.sleep();
    }
    
}
