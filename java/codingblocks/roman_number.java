import java.util.Scanner;
class number{
  int i=1,v=5,x=10,l=50,c=100,d=500,m=1000,first=0,second,num=0;
  String s;

  public void get(String x){

    s =x.toLowerCase();
}
 

public void calculation(){
   number nm = new number();
   for(int i =0 ; i<s.length();i++){
    first = nm.values(s.charAt(i));
    if(i+1<s.length()){
    second =nm.values(s.charAt(i+1));
    }
    if (first<second) {
        num -=first;
    }
    else if(first>=second){
      num +=first;
    }
   }
}

public int values(char l){
    switch (l) {
    case 'i':
        return  1;
    case 'v':
        return 5;
    case 'x':
        return 10;
    case 'l':
        return 50;
    case 'c':
        return 100;
    case 'd':
        return 500;
    case 'm':
        return 1000;
    default:
            return 0;
 }
}

  public void display(){
    System.out.println(num);
  }

}
public class roman_number{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number: ");
        String x =sc.nextLine();
        number obj= new number();
        obj.get(x);
        obj.calculation();
        obj.display();

    }
}