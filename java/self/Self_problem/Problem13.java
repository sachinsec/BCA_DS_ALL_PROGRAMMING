/*16.	Create Employee class:
•	method calculateSalary()
•	subclasses: FullTime, PartTime
 */
class Employee{
    double salary;
    public double calculateSalary(){
        return salary;
    }
}
class FullTime extends Employee{
    public void fullsalary(double balance){
     salary += balance;
    }
}
class PartTime extends Employee{
    public void Partsalary(double balance){
     salary += balance;
    }
}

public class Problem13 {
public static void main(String[] args) {
    System.out.println("This is problem 13");
    FullTime obj = new FullTime();
    PartTime obj1 = new PartTime();
    obj1.Partsalary(9000d);
    obj.fullsalary(90000d);
    System.out.println(obj.calculateSalary());
}
}
