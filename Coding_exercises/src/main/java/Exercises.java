public class Exercises {
    public static void main(String[] args) {
    //        checkNumber(0);

    // exercise 2 - in speedConverter.java class
    /*
            long miles = SpeedConverter.toMilesPerHour(10.5);
            System.out.println("Miles: " + miles);
            SpeedConverter.printConversion(10.5);
    */

    // exercise 3 - in MegaBytesConverter.java class
    //        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

    // exercise 4 - in barkindDog.java class
    /*        boolean var = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(var);*/

    // exercise 5 - IsLeapYear.java class
/*        boolean result = IsLeapYear.isLeapYear(2000);
        System.out.println(result);*/

//  exercise 6 - DecimalComparator.java class
    /*boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);*/

//        exercise 7 - EqualSumChecker.java class

//        exercise 8 - TeenNumberChecker.java class
        boolean result=TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(result);
    }

    // exercise 1 - positive, negative, zero
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else if(number == 0){
            System.out.println("zero");
        }
    }




}
