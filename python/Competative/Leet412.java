import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Leet412{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int number = sc.nextInt();

   System.out.println(Solution(number)); 

   }

   static List<String> Solution(int number){
      
    List<String> l = new ArrayList<>();

    for (int i = 1; i <= number; i++) {
        if(i%5 == 0 && i%3==0){
            l.add("FizzBuzz");
        }
        else if (i%3==0) {
            l.add("Fizz");
        }else if(i%5==0){
            l.add("Buzz");
        }
         else{
            l.add(String.valueOf(i));
        }
    }
    return l;

   }
}