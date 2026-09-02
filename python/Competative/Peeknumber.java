public class Peeknumber {
    public static void main(String[] args) {
        int [] l = {4,3,2,7,6};

        int count = 0;

        for (int i = 1; i < l.length-1; i++) {
            
            if(l[i-1]<l[i] && l[i]>l[i+1]){
               count ++;
            } if(i==1 || i==l.length-2){
                if (l[0]>l[i]) {
                    count++;
                }if(l[i]>l[l.length-1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
