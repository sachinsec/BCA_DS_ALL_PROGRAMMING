import java.util.Arrays;

public class Sumfind {
    public static void main(String[] args) {
        int[] p = {1200,2500,1800,3200,1500};
        int[] ans = new int[2];
        int b = 4300;

        for (int i = 0; i < p.length; i++) {
            int sum = 0;
            for (int j = 0; j < p.length; j++) {
                if(i!=j){
                    sum = p[i]+p[j];
                }
                if(b == sum){
                    ans[0]=i;
                    ans[1]=j;
                    break;

                }
            }
            if (b == sum) {
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
