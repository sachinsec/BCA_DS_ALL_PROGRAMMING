import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many term ");
        int d = sc.nextInt();

        System.out.println("Fibonacci Series:");
        System.out.println("0");
        System.out.println(b);

        for (int i = 1; i < d; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
