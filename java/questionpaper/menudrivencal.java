import java.util.Scanner;

public class menudrivencal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op,ch;
        float a,b,result = 0;
        do {
            System.out.println("Options:\n+.Adding\n-.difference\n*.Product\n/.division");
            op=sc.next().charAt(0);
            
            switch (op) {
                case '+':
                    System.out.println("Enter the value of a ");
            a=sc.nextFloat();
            System.out.println("Enter the value of b");
            b=sc.nextFloat();
                    result=a+b;
                    System.out.println(result);
                    break;
                case '-':
                    System.out.println("Enter the value of a ");
            a=sc.nextFloat();
            System.out.println("Enter the value of b");
            b=sc.nextFloat();
                    result=a-b;
                    System.out.println(result);
                    break;
                case '*':
                    System.out.println("Enter the value of a ");
            a=sc.nextFloat();
            System.out.println("Enter the value of b");
            b=sc.nextFloat();
                    result=a*b;
                    System.out.println(result);
                    break;
                case '/':
                    System.out.println("Enter the value of a ");
            a=sc.nextFloat();
            System.out.println("Enter the value of b");
            b=sc.nextFloat();
                    result=a/b;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("invalid option select try agian.");
                    break;
            }
            System.out.println("Are you continous y/n:");
            ch=sc.next().charAt(0);
        } while (ch=='y');

    }
}
