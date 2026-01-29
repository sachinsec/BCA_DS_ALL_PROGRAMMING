import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("Enter value of a ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Eneter value of b ");
        int b = sc.nextInt();

        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("Value of a is " + a + " value of b is " + b);
    }
}
