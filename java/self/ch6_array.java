import java.lang.reflect.Array;

public class ch6_array {
    public static void main(String[] args) {
        System.out.println("Hi, I am array.");
        // int mrk[] = new int[5];
        // Declration method
        // mrk[0] = 23;
        // mrk[1] = 32;
        // mrk[2] = 83;
        // mrk[3] = 88;
        // mrk[4] = 98;
        // 2 declration method
        int[] mrk = { 23, 34, 53, 56, 88 }; // Declration and initialization

        System.out.println(mrk[4]);
        for (int a = 0; a <= 4; a++) {
            System.out.println(mrk[a]);
        }
        // for each loop work
        for (int m : mrk) {
            System.out.println(m);
        }
    }
}
