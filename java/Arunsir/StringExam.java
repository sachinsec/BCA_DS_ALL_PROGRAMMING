import java.util.Scanner;

public class StringExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n,s;
        int vcount=0,ccount=0,whcount=0,spcount=0,dcount=0;
        System.out.println("Enter input");
        s=sc.nextLine();
        n=s.toLowerCase();

        for(int i = 0;i<n.length();i++){
            char ch = n.charAt(i);
            if(ch>=97 && ch<=122){
            if (ch=='a'|| ch=='e' ||ch=='i' || ch=='o' || ch=='u') {
                vcount++;
            }
            
            else{
                ccount++;
            }
        }
        else if (ch==' '){
                  whcount++;
            }
        else if (ch>=48 && ch<=57){
               dcount++;
        }
        else{
            spcount++;
        }
        }
        System.out.println("Vowel is = "+vcount);
        System.out.println("Con is = "+ccount);
        System.out.println("White space = "+whcount);
        System.out.println("Special "+spcount);
        System.out.println("Digit "+dcount);
    }
}
