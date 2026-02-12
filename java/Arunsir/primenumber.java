import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
