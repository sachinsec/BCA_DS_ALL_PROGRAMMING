class Employee{
    int empcode;
    String empname;
    double salary;
    public void getbasicdetails(int x,String y,double z){
       empcode = x;
       empname = y;
       salary = z;
    }

}

class empworking extends Employee{
    String desigination;
    float workinghours;
    double updatesalary;
    empworking(String desigination,float workinghours){
           this.desigination=desigination;
           this.workinghours=workinghours;
    }
    public void calculatesalary(){
        if (workinghours>6) {
             updatesalary = salary+(500*workinghours);
        }
            
       
    }
    public void display(){
        calculatesalary();
        System.out.println("Name:"+empname);
        System.out.println("Salary:"+salary);
        System.out.println("Desigination:"+desigination);
        System.out.println("Working Hours:"+workinghours);
        System.out.println("Update salary:"+updatesalary);
    }
}
public class Inheritance_Practice {
    public static void main(String[] args) {
        System.out.println("I am inheritance problem.");
    
        empworking obj = new empworking("HOD",8);
        obj.getbasicdetails(123,"Soham",128957.562);
        obj.display();

    }
}
