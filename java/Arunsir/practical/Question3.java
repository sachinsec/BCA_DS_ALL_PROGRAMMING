public class Question3 {
    public static void main(String args[]) {
        try {
    System.out.println("Start");
    Statement-1;
    Statement-2;
    Statement-3;
}
catch (ArithmeticException e) {
    System.out.println("Caught AE");
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Caught AIOOBE");
}
catch (Exception e) {
    System.out.println("Caught Exceptions");
}
finally {
    System.out.println("In Finally Block");
}

System.out.println("Last Statement");
    }
}
