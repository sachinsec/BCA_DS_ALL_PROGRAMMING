import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start number");
        int a = sc.nextInt();

        System.out.println("Enter last number");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            arm(i);
        }

        
    }

    static void arm(int a){
        int temp = a;
        int store = 1;
        int count = 0;
        int sum =0;

        while (a>0) {
            count ++;
            a/=10;
        }

        a = temp;

        while (a>0) {
            int d = 0;
            d = a%10;
            store =  1;

            for (int i = 0; i < count; i++) {
                  store *= d;
        }

        sum += store;
            a/=10;
        }

        if (sum == temp) {
            armprint(sum);
        }

        // if (sum == temp) {
        //    
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }

    static void armprint(int sum){
        System.out.println(sum);
    }
}