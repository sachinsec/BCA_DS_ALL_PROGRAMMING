import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        System.out.println("Enter digits");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 10 == 4) {
            System.out.println("Yes last digit is 4");
        } else {
            System.out.println("Not");
        }
    }
}
