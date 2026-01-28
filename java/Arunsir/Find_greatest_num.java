import java.util.Scanner;

public class Find_greatest_num {
    public static void main(String[] args) {
        System.out.println("Enter fist number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.err.println("This is the greatest number: " + a);
        } else if (b > c) {
            System.out.println("This is the greates number: " + b);

        } else {
            System.out.println("This is the greatest number: " + c);
        }

    }
}
