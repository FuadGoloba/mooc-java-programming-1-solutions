import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> bookInformation = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            String year = scanner.nextLine();
            
            bookInformation.add(new Book(title, pages, year));
            
        }
        
        System.out.println("What information will be printed?");
        String reply = scanner.nextLine();
        if (reply.contains("everything")) {
            for (Book info: bookInformation) {
                System.out.println(info);
            }
        }
        else if (reply.contains("name")) {
            for (Book info: bookInformation) {
                System.out.println(info.getTitle());
            }
             
        }

    }
}
