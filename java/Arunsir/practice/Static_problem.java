public class Static_problem {

    // Static Nested Class
    static class Nested {
        
        // 1. Static Method
        static void staticGreet() {
            System.out.println("Called via: Outer.Nested.staticGreet()");
        }

        // 2. Instance (Non-Static) Method
        void instanceGreet() {
            System.out.println("Called via: new Outer.Nested().instanceGreet()");
        }
    }

    public static void main(String[] args) {
        
        Static_problem.Nested.staticGreet();

        new Static_problem.Nested().instanceGreet();
    }
}