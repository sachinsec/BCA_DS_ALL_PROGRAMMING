import java.util.Scanner;

public class ch6_string_input {
    public static void main(String[] args) {
        String[] name = new String[4];

        Scanner sc = new Scanner(System.in);

        for (int a = 0; a <= 3; a++) {
            System.out.println("Enter Student " + (a + 1) + " Name:");
            name[a] = sc.nextLine();

        }
        for (int b = 0; b <= 3; b++) {
            System.out.println(name[b]);
        }

    }
}
