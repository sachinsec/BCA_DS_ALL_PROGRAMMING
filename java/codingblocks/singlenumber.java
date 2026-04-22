import java.util.Scanner;

public class singlenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {2,1,4,2,1};
        int count = 0;
        for(int i = 0 ;i<a.length;i++){
            count=0;
            for (int j = 0; j < a.length; j++) {
                if (a[i]!=a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    //     System.out.println(count);
    //    System.out.println(count==2);
    }
}
