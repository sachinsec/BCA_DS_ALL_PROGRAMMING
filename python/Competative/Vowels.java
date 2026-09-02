import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter word: ");

        String w = sc.nextLine();


        count(w);
    }
    
    static void count(String w){
        w.toLowerCase();

        for (int i = 0; i < w.length(); i++) {

            if (charAt(w[i])=='a' && w[i]=='e' ) {
                
            }
        }
    }
}
