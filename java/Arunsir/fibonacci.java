public class fibonacci {
    public static void main(String[] args) {
        int a, b = 1, c;
        for (a = 0; a <= 10; a++) {
            c = a + b;
            System.out.println(c);
            b = a;
            b = c;
        }
    }
}
