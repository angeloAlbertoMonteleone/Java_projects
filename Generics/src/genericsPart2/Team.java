package genericsPart2;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{ // it says that can be any class of player, and we don't need to cast any var
    //I can also put multiple types in the extends part: extends Player & Coach & Referee
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player ){
        if(members.contains(player)){
            System.out.println(player.getName() + " already exists in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + getName());
            return true;
        }
    }

    public int numOfPlayer(ArrayList<Player> members){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;

        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if(ourScore == theirScore){
            tied++;
            message = "drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }


    public int ranking(){
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }

    }
}
