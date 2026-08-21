public class Problem2{
    public static void main(String[] args){

        int [] list = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum);
    }
}