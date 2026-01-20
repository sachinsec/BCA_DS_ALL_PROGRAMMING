import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        System.out.println("If Your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Your age is 18");
                break;

            default:
                System.out.println("Working..... next time , you will get desire ouput.");
                break;
        }

    }
}
