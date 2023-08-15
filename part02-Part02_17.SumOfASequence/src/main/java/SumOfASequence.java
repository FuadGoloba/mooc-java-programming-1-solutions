
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int givenNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int number = 0; number <= givenNumber; number++) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
