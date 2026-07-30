import java.util.Scanner;
public class GrowSalary{
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("Salary: ");
        double salary = sc.nextDouble();
        
       double b =  bonous(salary);

       System.out.println("Bonus is = "+b);

    }

    static double bonous(double salary){

        if (32000<salary) {
          return  (salary * 10 )/100;
        }
        return (salary * 8)/100;
    }
}