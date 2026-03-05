import java.util.Scanner;
public class sum2d_array {
    public static void main(String[] args) {
       /* a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4; */
        
        Scanner sc = new Scanner(System.in);

        int sum=0;

        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int s[][]=new int[2][2];

        for(int i = 0;i<2;i++){
            for(int j= 0 ;j<2;j++){
            System.out.println("Enter number for first matrix: ");
            a[i][j]=sc.nextInt();
            }
        }

        for(int i = 0;i<2;i++){
            for(int j= 0 ;j<2;j++){
            System.out.println("Enter number for second matrix: ");
            b[i][j]=sc.nextInt();
            }
        }

        for(int i = 0;i<2;i++){
            for(int j= 0 ;j<2;j++){
            s[i][j]=a[i][j]+b[i][j];

            }
        }

        for(int i = 0;i<2;i++){
            
            for(int j= 0 ;j<2;j++){
            System.out.print(s[i][j]+" ");
            
            }
        System.out.println();
        }

    }
}
