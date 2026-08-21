import java.util.Arrays;

public class Inseration {
    public static void main(String[] args) {
        int [] list = {25,10,45,30,60,7,8,89,88};

        insert(list);
    }

    static void insert(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (list[j]<list[j-1]) {
                    swap(list,j,j-1);
                }
            }
        }
        System.out.println(list[list.length-2]);
    }

    static int[] swap(int[] list,int second, int first){
        int temp;
        temp = list[second];
        list[second]  = list[first];
        list[first] = temp;

        return list;
    }
}
