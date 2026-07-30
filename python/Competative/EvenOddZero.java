import java.util.Scanner;
public class EvenOddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        
        check(a);
    }
    static void check(int a){
        if (a%2 == 0 && a !=0) {
            System.out.println("Even");
        }else if(a == 0){
            System.out.println("Zero");
        } else{
            System.out.println(" Odd");
        }
    }
}
