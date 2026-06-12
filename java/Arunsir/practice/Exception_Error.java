public class Exception_Error {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;

        try {
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            // Adding a custom message makes the logs easier to read
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        } finally {
            System.out.println("Calculation attempt finished.");
        }
    }
}
