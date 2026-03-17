import java.util.Scanner;
class roman{
    int i=1,v=5,x=10,l=50,c=100,d=500,m=1000;
    int result=0,check=0;
    String n;
    public String get(String s){
     return n=s.toLowerCase();

    }
    public int right(){
        for(int j =0;j< n.length();j++){
       if (n.charAt(j)=='m') {
           check = m;
       }
       else if (n.charAt(j)=='d'){
           check = d;
       }
       else if (n.charAt(j)=='c'){
           check = c;
       }
       else if (n.charAt(j)=='l'){
           check = l;
       }
       else if (n.charAt(j)=='x'){
           check = x;
       }
       else if (n.charAt(j)=='v'){
           check = v;
       }
       else if (n.charAt(j)=='i'){
           check = i;
       }
      result += check;
   }
   return result;
    }
} 


public class doubt{
    public static void main(final String[] args) {
        
        String s="MCMXCIV";

        roman obj=new roman();
        obj.get(s);

    System.out.println(obj.right());

    }
}