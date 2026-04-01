class Myclass{
    protected String name="Arjun";
    private float salary=915483.65f;
    int id=102;
    protected void getData(){
    System.out.println("Name: "+name);
    }

    private void getDatap(){
        System.out.println("Salary: "+salary);
    }
    void deafultmeth(){
        System.out.println("ID: "+id);
    }
    public void display(){
     getData();
     getDatap();
     deafultmeth();
    }
}
public class AccessModi {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        
        obj.display(); 
        System.out.println("__________Through Calling___________");
        obj.deafultmeth(); //Default
        obj.getData();  //Protected
      //  obj.getDatap(); //private ,we can't access 
        obj.name="Doe"; // protected
      //  obj.salary=9845454.564; // we can't access private varialble
      obj.id=123; // protected variable 
      System.out.println("__________Variable Access__________");
        System.out.println("Name: "+obj.name);
        System.out.println("ID: "+obj.id);
      //  System.out.println("Salary: "+obj.salary);
        
    }
}
