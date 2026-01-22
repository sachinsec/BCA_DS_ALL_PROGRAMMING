import java.util.Scanner;

public class webfound {
    public static void main(String[] args) {
        System.out.println("Enter website.");
        Scanner sc = new Scanner(System.in);
        String webs = sc.nextLine();
        if (webs.endsWith(".com")) {
            System.out.println("This is commericial web");
        } else if (webs.endsWith(".gov")) {
            System.out.println("This is Goverment web.");
        } else if (webs.endsWith(".in")) {
            System.out.println("This is INdian web");
        }
    }
}
