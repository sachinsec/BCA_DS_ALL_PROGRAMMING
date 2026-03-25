// name initial
import java.util.Scanner;

public class StringExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,s;
        int count=0,n=0;
        
        System.out.println("Enter You complete name: ");
        s=sc.nextLine();
        str=s.toUpperCase();

        System.out.print(str.charAt(0)+".");     
        
        // For countig 
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                count++;
            }}

           // m[n++]=str.indexOf(' ', i);
           
           //For initialization last space indexing
           int []m = new int[count];
           for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
            m[n++]=str.indexOf(' ', i);
           }}

           //Printing initial except last string
           for(int i = 0;i<m[count-1];i++){
            char ch = str.charAt(i);
            if(ch==' '){
                System.out.print((str.charAt(i+1))+".");
            }}
           
           // For printing last String exactly
           for(int i = m[count-1];i<str.length();i++){

            System.out.print(str.charAt(i));
           
           }

         //  System.out.println("count = "+m[count-1]); for testing

       
    }
}
