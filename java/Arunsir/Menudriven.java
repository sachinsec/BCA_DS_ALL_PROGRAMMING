import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float area, l, b, r, side;
        float pi = 3.14f;
        int options;
        char ch = 'y';

        do {
            System.out.println("\t\t Welcome to Menu Driven Program for area calculation");
            System.out.println("1: Circle area");
            System.out.println("2: Rectangle area");
            System.out.println("3: Square area");

            System.out.println("Enter your option");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Enter redius");
                    r = sc.nextFloat();
                    area = pi * r * r;
                    System.out.println("Area of circle = " + area);
                    break;
                case 2:
                    System.out.println("Enter Length");
                    l = sc.nextFloat();
                    System.out.println("Enter bredth");
                    b = sc.nextFloat();
                    area = l * b;
                    System.out.println("Area of Rectangle = " + area);
                    break;
                case 3:
                    System.out.println("Enter Side");
                    side = sc.nextFloat();
                    area = side * side;
                    System.out.println("Area of Square = " + area);
                    break;

                default:
                    System.out.println("Invalid Options");
                    break;
            }
            System.out.println("Do you wish to continues y/n");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
    }

}
