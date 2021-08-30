package challenge;

import genericsPart2.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends SoccerTeam> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeams(T team){
        if(this.teams.contains(team)){
            System.out.println(team.getName() + " is already in the league " + getName());
            return false;
        }else{
            this.teams.add(team);
            System.out.println(team.getName() + " has been added in the league " + getName());
            return false;
        }
    }

    public boolean sortTeamByRanking() {
        if (this.teams.size() <= 0) {
            return false;
        } else {
            ArrayList<String> teamRanking = new ArrayList<>();
            for (T teamRank : this.teams) {
                teamRanking.add(teamRank.getName() + " : " + teamRank.ranking());
            }
            Collections.sort(teamRanking);
            for (String team : teamRanking) {
                System.out.println(team);
            }
            return true;
        }
    }

    public boolean printTeam(){
        Collections.sort(teams);
        if(teams.size() <= 0){
            return false;
        }else {
            for (T team : teams) {
                System.out.println(team.getName() + " : " + team.ranking());
            }
            return true;
        }
    }


}
