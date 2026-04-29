import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        int power =0,arm = 0 ;
        System.out.println("Enter starting number.\n");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter last number.\n");
        int b= sc.nextInt();

        for(int i = a;i<=b;i++){

            while (i>=0) {
                power++;
                i/=10;
            }
            while (i>=0) {
                int d = i/10;
                arm += d*power;

            }
        }


    }
}
