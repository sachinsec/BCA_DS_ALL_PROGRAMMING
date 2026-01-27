import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        System.out.println("Sum is " + (a + b));
    }
}
