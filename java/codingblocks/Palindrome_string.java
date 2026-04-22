import java.util.Scanner;
public class Palindrome_string {
    public static void main(String[] args) {
        String t, s, r="",c="";
        Scanner sc = new Scanner(System.in);
        t=sc.nextLine();
        t=t.toLowerCase();

        for(int i = 0 ; i<t.length();i++){
            char ch = t.charAt(i);
            if (ch>=97 && ch<=122 || ch>='0' && ch<='9') {
               c += ch;
            }

        }

        for(int i = c.length()-1 ; 0<=i;i--){
                 r = r+c.charAt(i);
        }

       System.out.println(r);
        System.out.println(c);

    }
}
