public class Main {
    public static void main(String[] args) {
        int ageOfClient = 20;



        // TERNARY OPERATORS

        /*   boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
          boolean isEighteenOrOver = (ageOfClient) == 20 ? true : false;

        if(isEighteenOrOver) {
            System.out.println("is eighteen or over");
        }*/





        /* double firVar = 20.00d;
        double secVar = 80.00d;

        double total = (firVar + secVar) * 100.00d;
        System.out.println("My first total = " + total);

        double theRemainer = total % 40.00d;
        System.out.println("My remainder = " + theRemainer);

        boolean isNotRemainder = (theRemainer == 0) ? true : false;
        System.out.println("is not remainder = "+isNotRemainder );

        if(!isNotRemainder){
            System.out.println("got some remainder");
        }*/





        int score=10000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
        calculateScore(true, 800, levelCompleted, bonus);
        int highScore = calculateScoreReturninInt(true, 800, levelCompleted, bonus);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Angelo", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }



    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("this is the final Score: " + finalScore);
        }
    }

    // in case we want to return somenthing, if gameOver is false return -1
    public static int calculateScoreReturninInt(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }





    public static void displayHighScorePosition(String playerName, int score){
        System.out.println(playerName + " managed to get into position " + score);
    }

    public static int calculateHighScorePosition(int score){
        /*if(score >= 1000){
            return 1;
        }else if (score >= 500 && score < 1000) {
            return 2;
        }else if (score >= 100 && score < 500){
            return 3;
        }else {
            return 4;
        }*/

        int position = 4;
        if(score >= 1000){
            position = 1;
        }else if (score >= 500 && score < 1000){
            position = 2;
        } else if(score >= 100 && score < 500){
            position = 3;
        }
        return position;
    }

}
