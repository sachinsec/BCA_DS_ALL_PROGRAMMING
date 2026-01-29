import java.util.Scanner;

public class cylinder_volume {
    public static void main(String[] args) {

        float r, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Redius");
        r = sc.nextFloat();

        System.out.println("Enter Height");
        h = sc.nextFloat();

        float v = 3.14f * (r * r * h);
        System.out.println("Volume of Cylinder: " + v);
    }
}
