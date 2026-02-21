import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        String na;
        Scanner sc=new Scanner(System.in);
        na=sc.nextLine();
        int co=0;
        for(int i = 0;i<na.length();i++){
           if (na.charAt(i)==' ') {
            co++;
           }
        }  
        System.out.println("White space = "+co);      
    }}