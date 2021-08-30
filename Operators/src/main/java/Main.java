public class Main {
    public static void main(String[] args) {
        int result = 5;
        result++; // 6

        result--; // 5

        result+=2; //5 + 2

        result *= 10; //7 * 10

        result /= 10; //70 / 7

        result -= 2; //10 - 2

        int firstResult = 1 + 2; // 3
        int previousResult = firstResult; // 3

        firstResult = firstResult - 1; // 2

        //previousResult; still 3, variables are indipendent when there is an update

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("it is not an alien!");
            System.out.println("and I am scared of aliens");
            //just and I m scare of aliens in sout

        if(isAlien == false)
            System.out.println("it is not an alien!");
            System.out.println("and I am scared of aliens");
            //it is not an alien and I m scare of aliens in sout


    }
}
