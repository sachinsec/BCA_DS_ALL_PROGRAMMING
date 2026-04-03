/*5.	Create a BankAccount class:
o	attributes: accountNumber, balance
o	constructor + method to deposit and withdraw
 */
class BankAccount{
    long accountNumber;
    double balance;
    BankAccount(long accountNumber,double balance){
     this.accountNumber=accountNumber;
     this.balance=balance;
    }
    public void deposit(double deposite_balance){
     balance+=deposite_balance;
     System.out.println("Deposite Successfully");
    }
    public void withdraw(double deposite_balance){
     balance -=deposite_balance;
     System.out.println("Withdraw Successfully");
    }
    public void display(){
        System.out.println("Account number is: "+accountNumber+"\nAvailable Balance: "+balance);
    }
}
public class problem4 {
    public static void main(String[] args) {
        System.out.println("I am problem 4");
         BankAccount obj= new BankAccount(85492135009816l,1200d);
         obj.deposit(500.54d);
         obj.withdraw(200.23d);
         obj.display();

       
    }
}
