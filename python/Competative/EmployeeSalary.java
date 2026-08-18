import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int days;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name");
            name =sc.nextLine();
            System.out.println("Enter days");
            days = sc.nextInt();
            
            display(name,days);
            sc.nextLine();
        }
    }

    static void display(String name,int days){
        double salary = 30000;
      System.out.println("Name : "+name);
      if (days >= 25) {
        System.out.println("Salary: "+ salary);
      } else if(days >= 22 && days<25){
        System.out.println("Salary: "+(salary*90)/100);
      }  else if(days >= 18 && days<22){
        System.out.println("Salary: "+(salary*70)/100);
    } else{
        System.out.println("Salary: "+(salary*50)/100);
    }
}
}