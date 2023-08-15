
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int numberGiven = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        for (int number = 1; number <= numberGiven; number++) {
            factorial *= number;
        }
        System.out.println("Factorial: " + factorial);
    }
}
