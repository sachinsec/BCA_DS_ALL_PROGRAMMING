/*10.	Create Student class:
•	private fields
•	getter & setter methods
 */
class Student{
    private String fields="Cyber expert and Data SCienctist",name;
    private int rollno;
    
    public String getname(){
     return name;
    }
    public int getroll(){
        return rollno;
    }
    public void setdata(String name,int rollno){
      this.name=name;
      this.rollno=rollno;
    }
}
public class problem7 {
    public static void main(String[] args) {
        System.out.println("I am problem 7");
        Student obj=new Student();
        obj.setdata("Sachin", 102);
        System.out.println("Name: "+obj.getname());
        System.out.println("Rollno: "+obj.getroll());
    }
}
