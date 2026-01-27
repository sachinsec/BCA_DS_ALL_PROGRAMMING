import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of principle");
        int p = sc.nextInt();

        System.out.println("Enter value of Rate");
        int r = sc.nextInt();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Simple interest is " + si);

    }
}
