/* Compile-Time Polymorphism (Method Overloading) */

class calculator{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double a, double b, double c){
        return a+b+c;
    }
}
public class ch11_polymorphism {
    public static void main(String[] args) {
        calculator sc = new calculator();
        System.out.println(sc.sum(3,4));
        System.out.println(sc.sum(2.2,4.2,5.2));
        System.out.println(sc.sum(3,4,5));        
    }
}
