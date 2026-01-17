import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        // float a = 7f / 4 * 9f / 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of v");
        float v = sc.nextFloat();
        System.out.println("Enter the value of u");
        float u = sc.nextFloat();
        System.out.println("Enter the value of a");
        float a = sc.nextFloat();
        System.out.println("Enter the value of s");
        float s = sc.nextFloat();
        float ans = (v * v - u * u) / (2 * a * s);
        System.out.println(ans);
    }
}
