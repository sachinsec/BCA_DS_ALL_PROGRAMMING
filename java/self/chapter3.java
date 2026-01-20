public class chapter3 {
    public static void main(String[] args) {
        // String a = " Sachin ";
        // System.out.println("[" + a.trim() + "]");
        String a = "Sachin prajpat"; // use \' for use qoute
        System.out.println(a.substring(1, 4));
        System.out.println(a.replace(" ", "_"));
        System.out.println(a.startsWith("na"));
        System.out.println(a.toLowerCase());
        System.out.println(a.equalsIgnoreCase("Sachin Prajpat")); // equalsIgnoreCase use for case ignoring
        System.out.println(a.lastIndexOf("n")); // this statement tells last digit value

    }

}
