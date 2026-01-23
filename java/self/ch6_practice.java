import java.util.Scanner;

public class ch6_practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float[] num = new float[5];
        for (int a = 0; a <= 4; a++) {
            System.out.println("Enter number " + (a + 1));
            num[a] = sc.nextFloat();
            sum += num[a];

        }
        System.out.println("Sum of the give number is = " + sum);
        // 2nd question
        System.out.println("Enter number for searching ");
        int br = 0;
        float b = sc.nextFloat();
        for (int c = 0; c < 5; c++) {
            if (b == num[c]) {
                br = 1;
                break;
            }

        }
        if (br == 1) {
            System.out.println("yes, I found out");
        } else {
            System.out.println("Not find out");
        }

        for (int a = 0; a < 5; a++) {
            for (int c = 0; c < 5; c++) {
                if (num[a] > num[c]) {
                    System.out.println(a);
                }
            }
        }

    }
}