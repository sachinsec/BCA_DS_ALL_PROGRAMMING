interface bicycle {
    int a = 34;
public void applybreak(int decrement);
public void speedup(int increment);
    
}
class Atcycle implements bicycle{
    public void blowhorn(){
     System.out.println("Tujhe dekh to jaana....");
    }
    public void applybreak(int decrement){
    System.out.println("Applybreak_/-_/-_/-_/-_/-_/-_/");
    }
    public void speedup(int increment){
        System.out.println("Speedup >->>>>>>>>>>>>>> ");

    }
}
public class ch11_interface {
    public static void main(String[] args) {
        Atcycle obj = new Atcycle();
        obj.applybreak(0);
        // You can create properties in interface
        obj.speedup(0);
        // You can't modify properties in interface
        obj.a =45;
        System.out.println(obj.a);
    }
}
