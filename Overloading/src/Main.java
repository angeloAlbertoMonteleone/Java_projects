public class Main {
    public static void main(String[] args) {
        /*int newScore = calculateScore("Angelo", 20);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();*/

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if(centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    //    exercise
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 || inches <= 12)) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }else {
            System.out.println("Invalid values");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
     if(inches >= 0){
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
         System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
         return calcFeetAndInchesToCentimeters(feet, remainingInches);
     }else {
         return -1;
     }
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("unnamed played scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no points");
        return 0;
    }


}
