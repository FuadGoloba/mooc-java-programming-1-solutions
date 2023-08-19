
import java.util.Scanner;


public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int maxVolume = 100;

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + first + " /" + maxVolume);
            System.out.println("Second: " + second + " /" + maxVolume);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = (Integer.valueOf(parts[1]));

            if (command.equals("add") && amount > 0) {
                if ((amount + first) <= maxVolume) {
                    first += amount;
                }
                else {
                    first = maxVolume;
                }
            }
            if (command.equals("move") && amount > 0) {
                if ((amount > first)) {
                    amount = first;
                    first = 0;
                }
                else {
                    first -= amount;
                }
                if ((amount + second) <= maxVolume) {
                    second += amount;
                }
                else {
                    second = maxVolume;
                }
            }
            if (command.equals("remove") && amount > 0) {
                if (amount > second) {
                    second = 0;
                }
                else {
                    second -= amount;
                }
            }

        }
    }

}
