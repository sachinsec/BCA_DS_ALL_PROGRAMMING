import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class DayFind {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Format for input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");

        // Convert String to Date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Get day
        DayOfWeek day = date.getDayOfWeek();

        // Print result
        System.out.println("Day is: " + day);
    }
}
