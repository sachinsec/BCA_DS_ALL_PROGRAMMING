import java.util.Arrays;

public class Reversestore {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50};
        
       int[] arr =  reverse(list);
       System.out.println(Arrays.toString(arr));
    }
    static int [] reverse(int[] list ){
        for (int i = 0; i < list.length/2; i++) {
             int temp = list[i];
             list[i] = list[(list.length-1)-i];
             list[(list.length-1)-i] =temp;
        }
       return list;
    }
}
