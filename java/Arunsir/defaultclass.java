class Myclass{
    String name;
    void getData(){
    name="John";
    }
    public void display(){
        getData();
        System.out.println("Name: "+name);
    }
}
public class defaultclass{
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
        obj.getData();
         obj.name="Doe";
         System.out.println("Name: "+obj.name);
        
    }
}
