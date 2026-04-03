/*15.	Create interface Payment:
•	methods: pay()
•	implement: CreditCard, UPI
 */
interface Payment{
    public void pay();
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Creditcard is here.");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("UPI is here.");
    }
}


public class Problem12 {
    public static void main(String[] args) {
        System.out.println("I am Problem12");
        Payment obj = new CreditCard();
        Payment obj1 = new UPI();
        obj.pay();
        obj1.pay();
    }
}
