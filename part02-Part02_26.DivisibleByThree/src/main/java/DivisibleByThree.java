
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int beginning = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(beginning, end);

    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        
        while(beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning++;
        }
    }

}
