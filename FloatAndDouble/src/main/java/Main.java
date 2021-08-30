import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min float value "+ myMinFloatValue);
        System.out.println("My max float value "+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My min double value "+ myMinDoubleValue);
        System.out.println("My max double value "+ myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // 5.00 / 3.00
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        //exercise

        double numberOfPounds = 200d;
        double numberOfKilograms = 0.45359237d;
        double totalValueOfPounds = numberOfPounds * numberOfKilograms;
        System.out.println("value of pounds in kg "+ totalValueOfPounds);

        double pi = 3.443884383;
        double anotheNumber = 3_000_000.4_544_890d;
        System.out.println(pi);
        System.out.println(anotheNumber);

        //exercise 2

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myUnicodeCopyright = '\u0044';

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        String mystring = "this is a string";
        mystring = mystring + ", and this is more..";
        mystring = mystring + " \u00A9 2019";
        String numberString = "250.55";
        numberString = numberString + "49.95"; // 250.5549.95
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // 1050
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; // 1050120.47



    }

}
