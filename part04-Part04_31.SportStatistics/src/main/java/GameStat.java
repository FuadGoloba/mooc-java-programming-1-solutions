/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fuadgoloba
 */
public class GameStat {
    
    private String homeTeam;
    private String visitingTeam;
    private int homePoint;
    private int visitingPoint;

    public GameStat(String homeTeam, String visitingTeam, int homePoint, int visitingPoint) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoint = homePoint;
        this.visitingPoint = visitingPoint;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(this.homeTeam) && this.homePoint > this.visitingPoint) {
            return true;
        }
        
        if (team.equals(this.visitingTeam) && this.visitingPoint > this.homePoint) {
            return true;
        }
        
        return false;
    }
}

