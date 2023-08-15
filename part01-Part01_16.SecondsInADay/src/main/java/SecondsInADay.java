
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int hoursInDays = 24 * days;
        int secondsInDays = hoursInDays * 3600;
        System.out.println(secondsInDays);

    }
}
