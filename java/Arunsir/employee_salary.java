import java.util.Scanner;

class employee {
    int empid;
    double salary, exper, ycb, bonus, growsal;
    String name;
    Scanner sc = new Scanner(System.in);

    public void inputdetails() {
        System.out.println("Enter YOur name :");
        name = sc.nextLine();
        System.out.println("Enter your salary:");
        salary = sc.nextDouble();
        System.out.println("Enter Empid");
        empid = sc.nextInt();
        System.out.println("Enter your experience");
        exper = sc.nextDouble();

    }

    public double calcu() {
        if (exper % 5 == 0) {
            bonus = (salary * 15) / 100;
        }
        ycb = (salary * 6) / 100;

        growsal = salary + ycb + bonus;
        return growsal;

    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("EmpID: " + empid);
        System.out.println("Experience: " + exper);
        System.out.println("Basic salary: " + salary);
        System.out.println("Grosslary: " + calcu());
        System.out.println("Bonus: " + bonus);
        System.out.println("Yearly Increament: " + ycb);
    }

}

public class employee_salary {
    public static void main(String[] args) {
        System.out.println("Hello employee");
        employee obj = new employee();
        obj.inputdetails();
        obj.display();
    }

}
