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
        int count = 0;
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
