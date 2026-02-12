import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int d, st = 0;
        System.out.println("Enter digit: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        while (b >= 1) {
            d = b % 10;
            st = st * 10 + d;
            b /= 10;
        }

        if (st == a) {
            System.out.println("Yes, palindrome");
        } else {
            System.out.println("Not, Palindrome");
        }
    }
}
