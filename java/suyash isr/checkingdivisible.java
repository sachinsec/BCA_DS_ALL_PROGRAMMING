import java.util.Scanner;

public class checkingdivisible {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 7 == 0) {
            System.err.println("This is not divisible by 7");
        } else {
            System.out.println("Not divisible.");
        }

    }
}
