public class check {

    public static void main(String[] args) {
        int start = 1, count = 0;
        while (start > 0) {
            start /= 10;
            count++;
            System.out.println(count);
        }
    }
}