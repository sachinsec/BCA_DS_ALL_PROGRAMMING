import java.util.Scanner;

public class ch5_whileloop {
    public static void main(String[] args) {
        System.out.println("Enter your number.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
    }
}
