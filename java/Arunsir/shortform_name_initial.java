// name initial
import java.util.Scanner;

public class shortform_name_initial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,s;
        int p=0;
        
        System.out.println("Enter You complete name: ");
        s=sc.nextLine();
        str=s.toUpperCase();

        System.out.print(str.charAt(0)+".");     
           
           //For initialization last space indexing
           for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
            p=str.indexOf(' ', i);
           }}

           //Printing initial except last string
           for(int i = 0;i<p;i++){
            char ch = str.charAt(i);
            if(ch==' '){
            System.out.print((str.charAt(i+1))+".");
            }}
           
           // For printing last String exactly
           for(int i = p;i<str.length();i++){
            System.out.print(str.charAt(i));
           
           }
       
    }
}
