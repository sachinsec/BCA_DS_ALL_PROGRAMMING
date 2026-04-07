import mypack.hybrid;  //my packages this is create by cmd javac -d . name.java
import mypack.Basic;
import mypack.Sccalculator;


public class Custom_package {

    public static void main(String[] args) {

        hybrid h=new hybrid();
        Sccalculator sc=new Sccalculator();
        Basic b= new Basic();


        System.out.println(h.square(2));
        System.out.println(h.cube(2));
        System.out.println(h.squareroot(64));

        System.out.println(sc.divide(9,3));
        System.out.println(sc.multiple(9,3));
        
        System.out.println(b.add(2,3));
        System.out.println(b.sub(2,3));
        
    
    }
}