import java.util.Scanner;

public class ch5_prectice {
    public static void main(String[] args) {
        // for (int a = 0; a <= 5; a++) {
        // // System.out.println("*".repeat(a)); //this is single loop use, we will be
        // use
        // // .repeat()function
        // for (int i = 0; i <= a; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /// Q even sum
        // int a = 0;
        // int sum = 0;
        // while (a <= 5) {
        // if (a % 2 == 0) {
        // sum += a;
        // }
        // a++;
        // }
        // System.out.println(sum);

        // Q n number table

        int a, b = 1;
        System.out.println("Enter Table number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (b <= 10) {
            System.out.println(a + "X" + b + "=" + (a * b));
            b++;
        }
    }
}
