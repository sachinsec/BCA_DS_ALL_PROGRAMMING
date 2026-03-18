import java.util.Scanner;
class number{
  int i=1,v=5,x=10,l=50,c=100,d=500,m=1000,r=0,num;
  String s;

  public void get(String x){

    s =x.toLowerCase();
}

public void calculation(){
   number nm = new number();
   for(int i =0 ; i<s.length();i++){
  //  System.out.println(s.charAt(i));
     nm.values(s.charAt(i));

   }
}

public int values(char l){
 switch (l) {
    case 'i':
        return  1;
        break;
    case 'v':
        return 5;
        break;
    case 'x':
        return 10;
        break;
    case 'l':
        return 50;
        break;
    case 'c':
        return 100;
        break;
    case 'd':
        return 500;
        break;
    case 'm':
        return 1000;
        break;
 }

}

  public void display(){
    System.out.println(r);
  }

}
public class roman_number{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String x =sc.nextLine();
        number obj= new number();
        obj.get(x);
        obj.display();

    }
}