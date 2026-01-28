import java.util.Scanner;

public class Subject_grade {
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

        System.out.println("Your percantage is " + per);
        if (70 < per) {
            System.out.println("Passed excellent.");
        } else if (60 <= per) {
            System.out.println("Pass with first devesion");
        } else if (50 <= per) {
            System.out.println("Passed with second ");

        } else if (40 <= per) {
            System.out.println("Passed with third");
        } else {
            System.out.println("Fail");
        }
    }
}
