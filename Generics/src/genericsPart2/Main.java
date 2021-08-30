package genericsPart2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer angelo = new BaseballPlayer("Angelo");
        SoccerPlayer alberto = new SoccerPlayer("Alberto");

        Team<SoccerPlayer> inter = new Team("Inter");
        Team<SoccerPlayer> milan = new Team("Milan");
//            inter.addPlayer(joe);
//            inter.addPlayer(angelo);
            inter.addPlayer(alberto);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");
        baseballTeam.addPlayer(angelo);

        Team<FootballPlayer> brokenTeam = new Team<>("Miami");
        brokenTeam.addPlayer(joe);

        inter.matchResult(milan, 2, 0);
        milan.matchResult(inter, 0, 2);
        milan.matchResult(inter, 3, 2);
        milan.matchResult(inter, 4, 2);

        System.out.println("Rankings :" + inter.ranking());
        System.out.println(inter.getName() + " : " + inter.ranking() );
        System.out.println(milan.getName() + " : " + milan.ranking() );
        System.out.println(baseballTeam.getName() + " : " + baseballTeam.ranking() );
        System.out.println(brokenTeam.getName() + " : " + brokenTeam.ranking() );

//        System.out.println(inter.compareTo(milan));
//        System.out.println(milan.compareTo(inter));

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(milan);
        teams.add(inter);
        teams.add(baseballTeam);
        teams.add(brokenTeam);

        Collections.sort(teams);

        for(Team team : teams){
            System.out.println(team.getName());
        }
    }
}
