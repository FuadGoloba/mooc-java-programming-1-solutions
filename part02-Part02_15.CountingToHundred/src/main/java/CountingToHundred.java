
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        for (int count = number; count <= 100; count++) {
            System.out.println(count);
        }
        

    }
}
