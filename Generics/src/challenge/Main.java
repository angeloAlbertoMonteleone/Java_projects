package challenge;

import genericsPart2.BaseballPlayer;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SoccerTeam milan = new SoccerTeam("Milan");
        SoccerTeam inter = new SoccerTeam("Inter");
        SoccerTeam roma = new SoccerTeam("Roma");
        SoccerTeam juventus = new SoccerTeam("Juventus");
        BaseballTeam baseballTeam = new BaseballTeam("Miami");

        League serieA = new League("serie A");

        serieA.addTeams(milan);
        serieA.addTeams(juventus);
        serieA.addTeams(inter);
        serieA.addTeams(roma);

        inter.matchResult(juventus, 3, 0);
        inter.matchResult(milan, 3, 2);
        inter.matchResult(roma, 2, 2);

        roma.matchResult(juventus, 4,5);
        roma.matchResult(milan, 4,4);
        roma.matchResult(inter, 4,4);

        milan.matchResult(inter, 3,3);
        milan.matchResult(juventus, 0,3);
        milan.matchResult(roma, 2,2);

        juventus.matchResult(inter, 3, 5);
        juventus.matchResult(roma, 0, 3);
        juventus.matchResult(milan, 3, 1);

        serieA.printTeam();

    }
}
