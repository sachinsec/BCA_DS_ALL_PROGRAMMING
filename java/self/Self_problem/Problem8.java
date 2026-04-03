/*11.	Create ATM class:
•	balance should be private
•	allow access using methods
 */
class ATM{
    private double balance;
    public double getdata(){
     return balance;
    }
    public void setdata(double amount){
      balance = amount;
    }
}
public class Problem8 {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.setdata(12035.98);
        System.out.println("Amount : "+obj.getdata());

    }
}
