import java.util.Scanner;

public class assignment_grade {
    public static void main(String[] args) {
        int j, d, s, m, gd;
        float per;
        System.out.println("Enter Java marks");
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();

        System.out.println("Enter DBMS marks");
        d = sc.nextInt();

        System.out.println("Enter Statistic marks");
        s = sc.nextInt();

        System.out.println("Enter maths marks");
        m = sc.nextInt();

        System.out.println("Enter Gd marks");
        gd = sc.nextInt();
        float total = j + d + s + m + gd;
        per = (total / 5);

        System.out.println("Your marks in java is " + j);
        System.out.println("Your marks in DBMS is " + d);
        System.out.println("Your marks in Statistic is " + s);
        System.out.println("Your marks in maths is " + m);
        System.out.println("Your marks in GD is " + gd);

        System.out.println("Your total marks is " + total);

        System.out.println("Your percantage is " + per);
        if (90 <= per) {
            System.out.println("A+ grade");
        } else if (80 <= per) {
            System.out.println("A grade");
        } else if (70 <= per) {
            System.out.println("B grade");

        } else if (60 <= per) {
            System.out.println("C grade");
        } else if (50 <= per) {
            System.out.println("D grade");
        } else if (40 <= per) {
            System.out.println("E grade");

        } else {
            System.out.println("Fail");
        }
    }
}
