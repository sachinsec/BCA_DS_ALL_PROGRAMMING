public class FindLargest {
    public static void main(String[] args) {
        int [] list = {25,10,45,30,60,5,90,80};

       int ans =  find(list);
       System.out.println(ans);
    }
    static int find(int [] list){
        int largest = 0;
        for (int i = 0; i < list.length; i++) {
                if (list[i]>largest) {
                    largest = list[i];
                }
            }    
        return largest;
    }
}
