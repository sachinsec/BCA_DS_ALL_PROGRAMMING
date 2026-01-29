import java.util.Scanner;

public class Squar_par_area {
    public static void main(String[] args) {
        System.out.println("Enter side ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Area of Square is " + (a * a) + " and perimeter is " + 4 * a);
    }
}
