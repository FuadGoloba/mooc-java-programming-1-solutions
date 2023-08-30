import java.util.Scanner;

public class UserInterface {
    private GradeStatistics statistics;
    private Scanner scanner;
    
    public UserInterface(GradeStatistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            this.statistics.addPoint(point);
        }
        this.statistics.printAverage();
        this.statistics.printPassingAverage();
        this.statistics.printPassPercentage();
        this.statistics.printGradeDistribution();
    }    
}
