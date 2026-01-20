import java.util.Scanner;

public class cha4_conditional {
    public static void main(String[] args) {
        System.out.println("Please ! Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age <= 60) {
            System.out.println("You can drive the car.");
        } else if (age > 60) {
            System.out.println("You can't drive");
        } else {
            System.out.println("You can't Drive the car.");
        }

    }
}
