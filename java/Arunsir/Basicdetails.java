import java.util.Scanner;

public class Basicdetails {
    public static void main(String[] args) {
        int roll, java, dbms, stat, gd, verbal, total;
        String name, course, sem, section;
        float per;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your Rollno:");
        roll = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your course.");
        course = sc.nextLine();

        System.out.println("Enter Section.");
        section = sc.nextLine();

        System.out.println("Enter your sem.");
        sem = sc.nextLine();

        System.out.println("Enter your java Marks.");
        java = sc.nextInt();

        System.out.println("Enter your DMBS marks.");
        dbms = sc.nextInt();

        System.out.println("Enter your Statistic marks.");
        stat = sc.nextInt();

        System.out.println("Enter your GroupD marks.");
        gd = sc.nextInt();

        System.out.println("Enter your Verbal marks.");
        verbal = sc.nextInt();

        total = java + dbms + stat + gd + verbal;
        per = total / 5;

        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
        System.out.println("Sem-" + sem);
        System.out.println("Section : " + section);
        System.out.println("Java marks : " + java);
        System.out.println("DBMS marks : " + dbms);
        System.out.println("Statistic marks : " + stat);
        System.out.println("Group Discsion marks : " + gd);
        System.out.println("Verbal marks : " + verbal);
        System.out.println("Your Total marks is " + total);
        System.out.println("Your percantage is " + per + "%");

    }
}
