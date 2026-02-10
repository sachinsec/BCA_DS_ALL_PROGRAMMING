import java.util.Scanner;

public class Menudrivencalcultor {
    public static void main(String[] args) {
        float a, b;
        int option;
        char ch = 'y';
        System.out.println("\t\t Welcome to Menudriven Calculator");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1: For Addtion");
            System.out.println("2: For Difference");
            System.out.println("3: For Product");
            System.out.println("4: For Division");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter value of a");
                    a = sc.nextFloat();
                    System.out.println("Enter value of b");
                    b = sc.nextFloat();
                    System.out.println("Sum of " + a + " and " + b + " is = " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter value of a");
                    a = sc.nextFloat();
                    System.out.println("Enter value of b");
                    b = sc.nextFloat();
                    System.out.println("Difference of " + a + " and " + b + " is = " + (a - b));
                    break;

                case 3:
                    System.out.println("Enter value of a");
                    a = sc.nextFloat();
                    System.out.println("Enter value of b");
                    b = sc.nextFloat();
                    System.out.println("Product of " + a + " and " + b + " is = " + (a * b));
                    break;
                case 4:
                    System.out.println("Enter value of a");
                    a = sc.nextFloat();
                    System.out.println("Enter value of b");
                    b = sc.nextFloat();
                    System.out.println("Division of " + a + " and " + b + " is = " + (a / b));
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("Do you want to continue y/n");
            ch = sc.next().charAt(0);

        } while (ch == 'y');
    }
}
