import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        
       String ans =  check(a);
        System.out.println(ans);
    }
    static String check(int a){
        
        return a % 2 == 0;
    }
}
