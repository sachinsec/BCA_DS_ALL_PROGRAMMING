import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int java[]=new int[10];
        int dbms[]=new int[10];
        int state[]=new int[10];
        int sum[] = new int[10];

        Scanner sc = new Scanner(System.in);
        
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
        for(int i=0;i<java.length;i++){
            System.out.println("Student: "+(i+1));
            System.out.println("JAVA: "+java[i]);
            System.out.println("DBMS: "+dbms[i]);
            System.out.println("STATISTIC: "+state[i]);
            System.out.println("Total: "+(i+1)+" = "+sum[i]);
        }
    }
}
