import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
        int rollnum;
        float salary;
        double pi;
        char gender;
        String address;
        System.out.println("Enter Roll number: ");
        rollnum = sc.nextInt();
        System.out.println("Enter Salary: ");
        salary = sc.nextFloat();
        System.out.println("Enter pi values");
        pi = sc.nextDouble();
        System.out.println("Enter the address: ");
        address = ad.nextLine();
        System.out.println("Enter the gender of and employee: ");
        gender = sc.next().charAt(0);
        System.out.println("Roll number is :" + rollnum);
        System.out.println("Salary is :" + salary);
        System.out.println("pi value is :" + pi);
        System.out.println("The address is :" + address);
        System.out.println("The Gender of employee is :" + gender);
    }
}
