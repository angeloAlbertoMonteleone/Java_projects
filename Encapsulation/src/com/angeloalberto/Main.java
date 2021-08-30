package com.angeloalberto;

public class Main {
    public static void main(String[] args) {


     /*   Player player = new Player();
        player.name = "Angelo";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
*/

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Angelo", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
