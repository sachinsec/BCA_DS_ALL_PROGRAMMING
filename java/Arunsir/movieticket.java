import java.util.Scanner;

public class movieticket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YOur age.\nUnder 12 years old then Enter a\nUndre 12-64 years old then Enter b");
        char age = sc.next().charAt(0);

        switch (age) {
            case 12:
                if (age > 12) {
                    System.out.println("Ticket prize is 5$");
                }
                break;

            default:
                break;
        }
    }
}
