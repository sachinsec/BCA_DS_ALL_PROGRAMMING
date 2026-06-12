import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        System.out.println("Welcome To Menu Driven Calculator.");
        double a,b;

        Scanner sc = new Scanner(System.in);
        char n ; 
        char ch;

        do {
            System.out.println("For Addition +");
            System.out.println("For Difference -");
            System.out.println("For Product *");
            System.out.println("For Division /");
            n=sc.next().charAt(0);

            System.out.println("Enter value of a ");
            a = sc.nextDouble();
            System.out.println("Enter the value of b");
            b = sc.nextDouble();

            switch (n) {
                case '+':
                    System.out.println(" Sum of "+a+" and "+b+" is = "+(a+b));
                    break;
                case '-':
                    System.out.println(" Difference of "+a+" and "+b+" is = "+(a-b));
                    break;
                case '*':
                    System.out.println(" Product of "+a+" and "+b+" is = "+(a*b));
                    break;
                case '/':
                    System.out.println(" Division of "+a+" and "+b+" is = "+(a/b));
                    break;
            
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("Do you Continous Y/N");
            ch = sc.next().charAt(0);

        } while (ch=='y' || ch == 'Y');
        System.out.println("Successfully Exit from Menu Driven Program. ");


    }
}