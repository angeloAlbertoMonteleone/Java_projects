public class Main {
    public static void main(String[] args) {
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
