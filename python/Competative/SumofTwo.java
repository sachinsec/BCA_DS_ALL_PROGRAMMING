import java.util.Scanner;
public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Value of a: ");
        int a  = sc.nextInt();
        System.out.println("Value of b");
        int b = sc.nextInt();
        System.out.println(sum(a,b));

    }
    static int sum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
