import java.util.Scanner;

public class swapwithout {
    public static void main(String[] args) {
        System.out.println("Enter the value of a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        a = a + b - a;
        b = a + b - b;
        System.out.println("The value of a is " + a + " and value of b is " + b);

    }
}
