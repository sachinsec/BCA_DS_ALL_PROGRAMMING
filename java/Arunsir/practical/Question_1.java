import java.util.Scanner;
public class Question_1{
    public static void main(String[]args){
        char ch;
        double a,b;
        Scanner sc = new Scanner (System.in);

        System.out.println("For Adding +");
        System.out.println("For Difference -");
        System.out.println("For Product *");
        System.out.println("For Division /");
        System.out.println("For Modules %");
        ch = sc.next().charAt(0);

        System.out.println("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b = sc.nextDouble();


        switch (ch) {
            case '+':
                System.out.println("Sum of "+a+" and "+b+" is = "+(a+b));
                break;
            
                case '-':
                System.out.println("Difference b/w "+a+" and "+b+" is = "+(a-b));
                break;

                case '*':
                System.out.println("Product of "+a+" and "+b+" is = "+(a*b));
                break;

                case '/':
                System.out.println("Division "+a+" and "+b+" is = "+(a/b));
                break;

                case '%':
                System.out.println("Modules of "+a+" and "+b+" is = "+(a%b));
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
    }
}