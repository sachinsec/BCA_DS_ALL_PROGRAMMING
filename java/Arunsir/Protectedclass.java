class Myclass{
    protected String name;
    protected void getData(){
    name="John";
    }
    public void display(){
        getData();
        System.out.println("Name: "+name);
    }
}
public class Protectedclass {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
        obj.getData(); 
        obj.name="Doe";
        System.out.println("Name: "+obj.name);
        
    }
}
