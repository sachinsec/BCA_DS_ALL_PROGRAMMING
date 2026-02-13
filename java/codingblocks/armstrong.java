import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter Digit start point :");
        Scanner sc = new Scanner(System.in);
        int end, start;
        int digit, arm = 0, count = 0, temp;
        start = sc.nextInt();
        System.out.println("Enter End point: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (; start <= end; start++) {
            int st = start;
            count = 0;
            arm = 0;
            while (st > 0) {
                st /= 10;
                count++;
            }
            st = start;
            for (int j = 1; j <= count; j++) {
                digit = st % 10;
                arm += Math.pow(digit, count);
                st /= 10;
            }
            if (arm == start) {
                System.out.println(arm);
            }
            st /= 10;
        }

    }
}
