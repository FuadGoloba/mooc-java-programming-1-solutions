import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdCollection collection;

    public UserInterface(Scanner scanner, BirdCollection collection) {
        this.scanner = scanner;
        this.collection = collection;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                Bird bird = new Bird(name, latinName);

                this.collection.add(bird);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = this.scanner.nextLine();
                if (this.collection.birdExists(birdName) == false) {
                    System.out.println("Not a bird!");
                } else {
                    this.collection.findBirdByName(birdName).addObservation();
                }
            }

            if (command.equals("All")) {
                this.collection.printBirds();
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = this.scanner.nextLine();
                if (this.collection.birdExists(birdName) == false) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(this.collection.findBirdByName(birdName));;
                }
            }
        }
    }

}
