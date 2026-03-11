interface Mycamera{
    void takeSnap();          // renamed to match implementation
    void Recordvido();
}

interface MyWifi{
 String[] getNetwork();
 void connect_network(String network);
}
class Mycellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone extends Mycellphone implements MyWifi,Mycamera{
    public void takeSnap(){
        System.out.println("Takking snap");
    } 
    public void Recordvido(){
        System.out.println("Vidoe recording.....");
    }
    public String [] getNetwork(){
        System.out.println("Getting list of network...");
        String [] networkList={"Harry","Sachin","Arjun5G"};
        return networkList;
    }
    public void connect_network(String network){
        System.out.println("connecting to "+network);
    }
}

public class ch11_default_method {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
