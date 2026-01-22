public class ch5_forloop {
    public static void main(String[] args) {
        // for (int a = 0; a <= 100; a++) {
        // System.out.println(a);
        // if (a == 50) {
        // break; // break statement
        // }
        // }
        System.out.println("Reverse");
        for (int a = 100; a >= 0; a--) {
            if (a == 60) {
                continue; /// skip a specific itration
            }
            System.out.println(a);
        }
    }
}
