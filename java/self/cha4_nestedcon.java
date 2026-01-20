import java.util.Scanner;

public class cha4_nestedcon {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {

            if (age < 60) {
                System.out.println("You can drive the car.");

            } else {
                System.out.println("You can't drive the car");
            }
        } else {
            System.out.println("You can't Drive the car.");
        }
    }
}
