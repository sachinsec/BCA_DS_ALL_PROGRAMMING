class test{
   static int id = 2;

   static public void display1(){
    System.out.println("Hello I am static method of test class.");
   }
   static class test1{
   static void display(){
        System.out.println("Hello I am static of nested class test2");
    }
   }
}
public class Static_keyword {
    public static void main(String[] args) {
        System.out.println("Hello I am static Keyword");

        System.out.println(test.id);   // We can access static variable without creating class object
     //   test.display1();                // We can access static method without createing object
        test.test1.display();
    }
}
