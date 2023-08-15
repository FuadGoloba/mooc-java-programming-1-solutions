
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        ArrayList<GameStat> games = readFromfile(fileName);
        
        
        ArrayList<GameStat> gamesOfATeam = new ArrayList<>();
        for (GameStat game : games) {
            if (game.getHomeTeam().equals(team) || game.getVisitingTeam().equals(team)) {
                gamesOfATeam.add(game);
            }
        }
        
        int wins = 0;
        for (GameStat game : games) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        
        System.out.println("Games: " + gamesOfATeam.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));
    }    
    
    public static ArrayList<GameStat> readFromfile(String file) {
        ArrayList<GameStat> games = new ArrayList<>();
            
        try(Scanner reader = new Scanner(Paths.get(file))) {
            int gamesCount = 0;
            int wins = 0;
            int losses = 0;
            
            while(reader.hasNextLine()) {
                String[] statistics = reader.nextLine().split(",");
                
                String homeTeam = statistics[0];
                String visitingTeam = statistics[1];
                int homePoint = Integer.valueOf(statistics[2]);
                int visitingPoint = Integer.valueOf(statistics[3]);
                    
                games.add(new GameStat(homeTeam, visitingTeam, homePoint, visitingPoint));
            }

        }
        catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
            
        return games;
    }
}
