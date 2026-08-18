import java.util.Arrays;
import java.util.Scanner;

public class Onlineshoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] pur = new int[5];
        double [] dis = new double[5];
        for (int i = 0; i < pur.length; i++) {
            System.out.println("Customer "+(i+1));
            pur[i] = sc.nextInt();
            System.out.println("Original: " + pur[i] );
            System.out.println("Discount: "+cal(pur[i]));
            dis [i] = cal(pur[i]);

        }
       System.out.println( "Highest Discount : "+compare(dis));
    }

    static int cal(int pur){
        int dis;
        if (pur>=10000) {
            dis = (pur*20)/100;
        } else if(pur <=9999 && pur >=5000){
            dis = (pur*10)/100;
        }else if(pur <=4999 && pur>=2000){
            dis = (pur*5)/100;
        }else{
            dis = 0;
        }

        return dis;
    }
   

    // For the Highest numbers
    static double compare(double [] dis){
        double high = 0;
        for (int i = 0; i < dis.length; i++) {
            if (high<dis[i]) {
                    high = dis[i];
                }
        }
        return high;
    }
    
}
