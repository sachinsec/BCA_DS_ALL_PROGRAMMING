class emp {
    String name;
    int salary;

    emp() {
        salary = 6000;
        name = "Sachin";
    }

    public void display() {
        System.out.println(name);
        System.out.println(salary);
    }
}

public class cha9_constructor {
    public static void main(String[] args) {
        System.out.println("Hello, this is my doubt");
        emp obj = new emp();
        // obj.name = "Sachin"; we access direct
        // obj.salary = 90000; we access direct
        obj.display();

    }
}
