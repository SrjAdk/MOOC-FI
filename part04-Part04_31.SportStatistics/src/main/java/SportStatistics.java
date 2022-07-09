
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Team> record = readFile(file);
        
        System.out.println("Team:");
        String teamName= scan.nextLine();
        
        int games = 0;
        int wins = 0;
        
        for(Team team : record){
            if(team.getTeamA().contains(teamName)){
                games++;
                if(team.getScoreA()>team.getScoreB()){
                    wins++;
                }
            }else if(team.getTeamB().contains(teamName)){
                games++;
                if(team.getScoreB()>team.getScoreA()){
                    wins++;
                }//end of if
            }// end of if else if
        }// end of for
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games-wins));
        
        
    }
    
    public static ArrayList<Team> readFile(String file){
        ArrayList<Team> teams = new ArrayList<>();
        String[] split;
        
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String line = read.nextLine();
                split = line.split(",");
                String teamA= split[0];
                String teamB= split[1];
                int scoreA = Integer.valueOf(split[2]);
                int scoreB = Integer.valueOf(split[3]);
                
                teams.add(new Team(teamA,teamB,scoreA,scoreB));
                
            }
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return teams;
    }
}
