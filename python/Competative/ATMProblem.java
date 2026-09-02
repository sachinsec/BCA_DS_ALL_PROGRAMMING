import java.util.Scanner;

public class ATMProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        int am = sc.nextInt();
        int in = 50000;
        trans(am,in);

    }

    static void trans(int am,int in){
      if (am > 20000) {
        System.out.println("Maximum Withdrwal limit exceeded.");
      } else if(am>0 && am%100==0){
        System.out.println("Successfull\n"+"Amount: "+(in-am));
      } else{
        System.out.println("Minimum Balance withdrawl 100 ");
      }
    }
}
