class Employee {
    private int salary;
    private String na;

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public void setname(String na) {
        this.na = na;
    }

    public int getsalary() {
        return this.salary;
    }

    public String getname() {
        return this.na;
    }

}

public class ch9_encapsulation {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setname("Sachin");
        obj.setsalary(900000);
        // obj.name="Sachin"; we cann't use this in ecapsulation. we use setter and
        // getter for accessing
        System.out.println(obj.getname() + "\n" + obj.getsalary());

    }
}
