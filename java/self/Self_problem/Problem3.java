class Book{
    String title,auther;
    int price;
    Book(String title,String auther,int price){
         this.title=title;
         this.auther=auther;
         this.price=price;
    }
    public void display(){
        System.out.println("Title: "+title+"\nAuther: "+auther+"\nPrice: "+price);
    }

}
public class Problem3 {
    public static void main(String[] args) {
        System.out.println("I am problem 3.");
        Book obj=new Book("Kali Linux","Nahama Sec",5000);
        Book obj1=new Book("Bug hunting","Nahama Sec",6000);

        obj.display();
        obj1.display();
    }
}
