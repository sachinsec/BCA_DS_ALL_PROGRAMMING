/*Input
4545
Output
4444
Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it. */

import java.util.Scanner;
public class chewbacca {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
        int [] a= new int[n.length()];
        for(int i = 0 ;i<n.length();i++){
          a[i] = Character.getNumericValue(n.charAt(i));
        }
        for(int i = 0 ;i<n.length();i++){
          System.out.print(a[0]);
        }
       
    }
}