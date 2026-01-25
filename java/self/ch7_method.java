public class ch7_method {
    // method
    int recarea(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        ch7_method rc = new ch7_method(); // object creation
        int c = rc.recarea(5, 9); // Method call
        System.out.println(c);

    }
}
