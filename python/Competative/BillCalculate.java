import java.util.Scanner;
public class BillCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] units = new int [5];

        for (int i = 0; i < units.length; i++) {
            System.out.println("Customer "+(i+1));
            units[i]=sc.nextInt();

            System.out.println("Bill Amount: "+ cal(units[i]));
        }

        
    }

    static int cal(int units){
        int am,su;
            if (units<=100) {
               am = units*5;
            }else if(units>100 && 200>units){
               su = units-100;
               am = (100*5) + (su*7);
            } else{
                am = units*10;
            }
        return am;
    }
}
