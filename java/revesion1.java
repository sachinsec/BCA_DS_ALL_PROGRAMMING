import java.util.Scanner;

public class revesion1 {
    public static void main(String[] args) {
        System.out.println("Enter value of Hindi ");
        Scanner sa = new Scanner(System.in);
        int h = sa.nextInt();
        System.out.println("Enter value of English: ");
        int e = sa.nextInt();
        System.out.println("Enter value of Math: ");
        int m = sa.nextInt();
        System.out.println("Enter value of Physics: ");
        int p = sa.nextInt();
        System.out.println("Enter value of Computer: ");
        int c = sa.nextInt();
        float t = h + e + m + p + c;
        float per = t / 5;
        System.out.format(per);
    }

}
