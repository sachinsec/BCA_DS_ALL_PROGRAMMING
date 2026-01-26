public class ch7_recursion {
    int recu(int x) {
        if (x > 1) {
            return x + recu(x - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Hi, I am recursion.");
        int a = 5;
        ch7_recursion obj = new ch7_recursion();
        System.out.println(obj.recu(a));
    }
}
