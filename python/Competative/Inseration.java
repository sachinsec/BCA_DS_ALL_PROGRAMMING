/**
 * Inseration
 */

import java.lang.reflect.Array;
import java.util.Arrays;
public class Inseration {

    public static void main(String[] args) {
        
        int [] arr = {-1, 0, 1, 2, -1, -4};

        sort(arr);
    }
    static int arrsize = 0;

    static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; 0 < j; j--) {
                
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }


            }
        }
        int [] ans = dupl(arr,arr.length-1);
        System.out.println(Arrays.toString(ans));
        find(ans);

        
    }
    // changing values
    static int[] swap(int[] aar, int s, int f){

        int temp ;
        temp = aar[f] ;
        aar[f] = aar[s];
        aar[s] = temp;
        return aar;
    }


    // remove duplicates and return as new uniqe array
    static int[] dupl(int[] arr,int size){

        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1]==arr[i]) {
                arr[i]=arr[i+1];
            }
            if (i==(arr.length-2)) {
                if (arr[i]==arr[i+1]) {
                    arrsize=arr.length-1;
                }
            }
        }
        int[] newarr = new int[arrsize];
        for (int i = 0; i < arrsize; i++) {
            newarr[i] = arr[i];
        }

        return newarr;
    }

    // three numbers add

    static void find(int [] num){
        for (int i = 0; i < num.length - 2; i++) {

            for (int j = i + 1; j < num.length - 1; j++) {

                for (int k = j + 1; k < num.length; k++) {

                    if((i!=j && i!=k && j!=k)){
                    if (num[i] + num[j] + num[k] == 0) {
                        
                        System.out.println(num[i] + " " + num[j] + " " + num[k]);
                    }
                }
             }
            }}}
}