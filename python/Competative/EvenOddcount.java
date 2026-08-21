public class EvenOddcount {
    public static void main(String[] args) {
        int[] list = {10,15,22,31,40,55};

        count(list);
    }

    static void count(int[] list){
        int ec = 0;
        int oc = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]%2==0) {
                ec++;
            }else{
                oc++;
            }
        }
        System.out.println("Even = "+ec + "\nOdd = " +oc);
    }
}
