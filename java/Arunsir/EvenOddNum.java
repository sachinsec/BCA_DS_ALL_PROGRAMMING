import java.util.Scanner;

public class EvenOddNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for checking ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("This is Even number.");
        } else {
            System.out.println("This is Odd number.");
        }
    }
}
