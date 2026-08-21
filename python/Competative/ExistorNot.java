public class ExistorNot {
    public static void main(String[] args) {
        int [] list = {10,20,30,40, 50};
        int target = 35;

        System.out.println(check(list,target));
    }
    static boolean check(int[] list,int target){
        for (int i = 0; i < list.length; i++) {
            if(list[i]==target){
                return true;
            }
        }
        return false;
    }
}
