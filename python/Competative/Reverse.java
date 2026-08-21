public class Reverse {
    public static void main(String[] args) {
        int[] list = {10,20,30,40,50};
        
        reverse(list);
    }
    static void reverse(int[] list ){
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
