import java.util.Arrays;

public class Productarray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4};

        pro(num);
    }

    static void pro(int[] num){
        
        int [] prod =new int[num.length];

        for (int i = 0; i < num.length; i++) {

            int m=1;
            for (int j = 0; j < num.length; j++) {
                if (i==j) {
                    continue;
                }else{
                   m *= num[j];
                }  
                prod[i] = m;           
            }
        }

        System.out.println(Arrays.toString(prod));
    }
}
