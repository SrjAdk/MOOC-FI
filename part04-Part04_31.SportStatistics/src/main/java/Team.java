/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Team {
    private String teamA,teamB;
    private int scoreA,scoreB;

    public Team(String teamA, String teamB, int scoreA, int scoreB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public String getTeamA(){
        return this.teamA;
    }
    
    public String getTeamB(){
        return this.teamB;
    }
    
    public int getScoreA(){
        return this.scoreA;
    }
    
    public int getScoreB(){
        return this.scoreB;
    }
    
}
