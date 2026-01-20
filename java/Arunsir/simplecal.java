import java.util.Scanner;

public class simplecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number:");
        float a = sc.nextFloat();

        System.out.println("Enter second number:");
        float b = sc.nextFloat();

        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        System.out.println("Difference of " + a + " and " + b + " is: " + (a - b));
    }
}
