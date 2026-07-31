public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(19));
    }
    static boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

