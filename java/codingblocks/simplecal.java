import java.util.Scanner;

public class simplecal {
    public static void main(String[] args) {
        char ch;
        int n1, n2, sum, sub, mu, div, mo;
        Scanner sc = new Scanner(System.in);
        do {
            ch = sc.next().charAt(0);
            if (ch == '+') {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                sum = n1 + n2;
                System.out.println(sum);
            } else if (ch == '-') {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                sub = n1 - n2;
                System.out.println(sub);
            } else if (ch == '*') {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                mu = n1 * n2;
                System.out.println(mu);
            } else if (ch == '/') {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                div = n1 / n2;
                System.out.println(div);
            } else if (ch == '%') {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                mo = n1 % n2;
                System.out.println(mo);
            } else if (ch == 'x' && ch == 'X') {
                System.out.println("Invalid");
            }

        } while (ch == 'x' && ch == 'X');

    }
}
