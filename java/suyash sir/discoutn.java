import java.util.Scanner;

public class discoutn {
    public static void main(String[] args) {
        System.out.println("Enter Amount.");
        Scanner sc = new Scanner(System.in);

        float am = sc.nextFloat();

        float dis = am * 10 / (100);
        System.out.println("billing amount: " + (am - dis));
    }
}
