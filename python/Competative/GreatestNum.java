import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number");
            a[i] = sc.nextInt();
        }

      System.out.println("Greatest number is = "+find(a));
        
    }

    static int find(int [] a){
        if (a[0]>a[1] && a[0] > a[2]) {
            return a[0];
        }
        else if (a[1] > a[2]) {
            return a[1];
        }
        else{
            return a[2];
        }
    }
}
