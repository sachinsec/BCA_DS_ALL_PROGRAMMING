class student {
    private String name = "Sachin";

    public String set() {
        return name;

    }

    public void disp() {
        student d = new student();
        System.out.println(d.set());
    }
}

public class ch8_oop {
    public static void main(String[] args) {
        System.out.println("Hello,I am a OOP");
        student name = new student();
        name.disp();

    }
}
