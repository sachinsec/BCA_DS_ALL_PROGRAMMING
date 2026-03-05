import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter number of digit");
        Scanner sc = new Scanner(System.in);
        int digit,pal=0;
        int a=sc.nextInt();
        int temp=a;
        for(;0<a;a=a/10){
        digit=a%10;
        pal=pal*10+digit;
        }
        if (temp==pal) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}
