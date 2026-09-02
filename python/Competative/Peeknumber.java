public class Peeknumber {
    public static void main(String[] args) {
        int [] l = {1,3,2,7,8};

        int count = 0;

        for (int i = 1; i < l.length-1; i++) {
            if(l[i-1]<l[i] && l[i]>l[i+1]){
               count ++;
            } else if(i==1 && i==l.length-1){
                if (l[0]>l[i]) {
                    count++;
                }if(l[l.length-1]==i){
                    
                }
            }
        }
        System.out.println(count);
    }
}
