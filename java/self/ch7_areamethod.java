public class ch7_areamethod {
    int l, b;

    void value(int x, int y) {
        l = x;
        b = y;

    }

    int area() {
        int ar = l * b;
        return ar;
    }

    public static void main(String[] args) {
        ch7_areamethod area = new ch7_areamethod();
        area.value(2, 3);
        System.out.println(area.area());

    }

}
