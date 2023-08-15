
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int sum = 0;
        int count = 0;
        int longest = 0;
        String longest_name = "";
        
        while (true) {
            String name_and_birth_year = scanner.nextLine();
            if (name_and_birth_year.equals("")) {
                break;
            }
            
            String[] parts = name_and_birth_year.split(",");
            if (parts[0].length() > longest) {
                longest = Integer.valueOf(parts[0].length());
                longest_name = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            count += 1;
            
        }
        System.out.println("Longest name: " + longest_name);
        System.out.println("Age of the birth years: " + (1.0 * sum / count));
        
    }
}
