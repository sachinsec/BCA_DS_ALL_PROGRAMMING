import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        
        double total= 0;
        double per= 0;

        System.out.println("Student name");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Roll no");
        int roll = sc.nextInt();

        int [] mark = new int[5];

        for (int i = 0; i < mark.length; i++) {
            System.out.println("Subject "+i+" Marks:");
            mark[i] = sc.nextInt();
            total += mark[i];
        }

        per = total/5;

        System.out.println("Student name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+per);
        System.out.println("Grade: "+grade(per));

    }
    static String grade(double per){
        if (per >= 90 && 100 >= per) {
            return "A";
        } else if(per >=80 && 89>=per){
            return "B";
        }else if(per >=70 && 79>=per){
            return "C";
        }else if(per >=60 && 69>=per){
            return "D";
        }

        return "Failed";
    }
}
