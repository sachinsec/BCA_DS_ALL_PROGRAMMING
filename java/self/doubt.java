class Roman_number{
int i=1,v=5,x=10,l=50,c=100,d=500,m=1000;
String s="ii",t;char n;
int result=0,curr=0,next;

public void initialize(){
    s=t.toLowerCase();
}

public int calculate_num(){
    Roman_number obj=new Roman_number();

    for(int j=0;j<s.length();j++){
   curr = obj.To_check(s.charAt(j));
   next = obj.To_check(s.charAt(j+1));

   if (curr>next) {
    result -= curr;
   }
   else{
    result += curr;
   }}

    return result;
}

public int To_check(char n){
char r=n;
   switch (r) {
    case 'm':
        return m;
    case 'd':
        return d;
    case 'c':
        return c;
    case 'l':
        return l;
    case 'x':
        return x;
    case 'v':
        return v;
    case 'i':
        return i;
    default:
        return 0;
   }
}

}


public class doubt {

    public static void main(String[] args) {
        Roman_number obj= new Roman_number();
        obj.calculate_num();
        
    }
}