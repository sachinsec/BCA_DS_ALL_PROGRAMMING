import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextInt();

        System.out.print("Enter credit score: ");
        int cre = sc.nextInt();

        check(age,salary,cre);
    }

    static void check(int age,double salary,int cre ){
        if (age>=21 && salary >= 30000 && cre >= 700) {
            System.out.println("Eligible");
        }if(age<21){
            System.out.println("Age issue");
        }if(cre < 700){
            System.out.println("Credit score below 700");
        }if(salary<30000){
            System.out.println("Salary below 30,000");
        }
    }
}
