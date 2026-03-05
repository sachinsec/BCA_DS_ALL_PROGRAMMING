import java.util.Scanner;

public class nstudent_arrayproblem {
    public static void main(String[] args) {
        float sn,sum=0,average;
        Scanner sc=new Scanner(System.in);

        System.out.println("How many students: ");
        sn=sc.nextFloat();

        float[] n=new float[(int)sn];

        for(int i=0;i<sn;i++){
            System.out.println("Enter marks of student: "+(i+1) );
            n[i]=sc.nextInt();
            sum +=n[i];
            }
            average =sum/sn;
            System.out.println(average);

        }
    }
