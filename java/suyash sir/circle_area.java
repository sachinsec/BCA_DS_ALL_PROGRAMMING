import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {
        System.out.println("Enter value of radius");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = (3.14f * r * r);
        System.out.println("Area of circle: " + area);
    }
}
