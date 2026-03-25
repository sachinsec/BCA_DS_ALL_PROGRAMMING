public class order_array {
    public static void main(String[] args) {
        int a[] = {92, 23, 8, 44, 9};
        int n = a.length;

        // simple ascending sort (selection-like)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // print sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
