import java.util.Scanner;

public class ch6_2d_array {
    public static void main(String[] args) {
        System.out.println("Hi, I am 2D array.");
        int[][] rmark = new int[3][5];
        Scanner sc = new Scanner(System.in);

        // for input from user
        for (int a = 0; a <= 2; a++) {
            System.out.println("Roll no: " + (a + 1));
            for (int b = 0; b <= 4; b++) {
                System.out.println("Enter Subject " + (b + 1) + " Marks:");
                rmark[a][b] = sc.nextInt();
            }

        }
        // For print
        System.out.println("DBMS JAVA GD STAT TECH");
        for (int c = 0; c <= 2; c++) {
            for (int d = 0; d <= 4; d++) {
                System.out.print(rmark[c][d] + "   ");
            }
            System.out.println("");
        }
    }
}
