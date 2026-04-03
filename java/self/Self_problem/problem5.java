/*6.	Create a Person class → inherit into Employee
o	Person: name, age
o	Employee: salary, designation
 */

class Person{
String name;
int age;
Person(String name,int age){
    this.name=name;
    this.age=age;
}
}
class Employee extends Person{
    double salary;
    String designation;
    Employee(String name,int age,double salary, String designation){
    super(name,age);
    this.salary=salary;
    this.designation=designation;
    }
public void display(){
    System.out.println("Name: "+name+"\nAge: "+age+"\nDesignation: "+designation+"\nSalary: $"+salary);
}
}
public class problem5 {
    public static void main(String[] args) {
        Employee obj=new Employee("Sachin", 20,2415.45d,"Cyber Expert");
        obj.display();
    }
    
}
