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
            case 19:
                System.out.println("Your age is " + age);
                break;
            case 20:
                System.out.println("Your age is " + age);
                break;
            case 21:
                System.out.println("Your age is " + age);
                break;
            default:
                System.out.println("Working..... next time , you will get desire ouput.");
                break;
        }

    }
}
