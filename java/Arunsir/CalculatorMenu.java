import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {

        float num1, num2, result;
        char operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom to Menu Driven Calcultor");
        System.out.println("+ : Addition of two numbers");
        System.out.println("- : Subtraction  of two numbers");
        System.out.println("* : Product  of two numbers");
        System.out.println("/ : Division  of two numbers");
        System.out.println(" Enter your option (+,-,*,/)");

        operation = sc.next().charAt(0);
        System.out.println("Enter first number");
        num1 = sc.nextFloat();
        System.out.println("Enter second number");
        num2 = sc.nextFloat();

        switch (operation) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                System.out.println("Result = " + (num1 / num2));
                break;

            default:
                System.out.println("Invailid options");
                break;
        }

    }
}
