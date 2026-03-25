import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many studnet");
        int size=sc.nextInt();
        int java[]=new int[size];
        int dbms[]=new int[size];
        int state[]=new int[size];
        int sum[] = new int[size];
        
        for(int i=0;i<java.length;i++){
          System.out.println("Enter java marks of Student: "+(i+1));
          java[i]=sc.nextInt();
        }
        for (int j = 0;j<dbms.length;j++) {
            System.out.println("Enter dbms marks of Student: "+(j+1));
            dbms[j]=sc.nextInt();
        }
        for (int j = 0;j<state.length;j++) {
            System.out.println("Enter state marks of Student: "+(j+1));
            state[j]=sc.nextInt();
        }
        for (int i = 0;i<java.length;i++) {
            sum[i] = java[i]+dbms[i]+state[i];
        }
        System.out.println("Result of all Student:");
        System.out.println("STUDENT   JAVA  DBMS  STATE TOTAL");
        for(int i=0;i<java.length;i++){
            
            System.out.println((i+1)+"          "+java[i]+"    "+dbms[i]+"    "+state[i]+"    "+sum[i]);
        }
    }
}
