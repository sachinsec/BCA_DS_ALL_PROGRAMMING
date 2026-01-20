import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number1:");
        float a = sc.nextFloat();
        System.out.println("Enter value of number2:");
        float b = sc.nextFloat();

        System.out.println("Addition :" + (a + b));
        System.out.println("Subtracation :" + (a - b));
        System.out.println("Multiplication :" + (a * b));
        System.out.println("Devision :" + (a / b));
        System.out.println("Modules :" + (a % b));
    }
}
