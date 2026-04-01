class Myclass{
    private String name;
    private void getData(){
    name="John";
    }
    public void display(){
        getData();
        System.out.println("Name: "+name);
    }
}
public class Privateclass {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
    //    obj.getData();   Due to private 
    //    obj.name="Doe";
     //   System.out.println("Name: "+obj.name);
        
    }
}
