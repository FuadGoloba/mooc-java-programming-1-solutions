
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            String result = "Not found.";
            while(reader.hasNextLine()) {
                if (reader.nextLine().equals(searchedFor)) {
                    result = "Found!";
                    break;
                }
            }
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }

    }
}
