import com.sun.security.auth.NTUserPrincipal;

public class Main {
    public static void main(String[] args) {


//            DayOfTheWeekChallenge.printDayOfTheWeek(-1);

        /*
        int result = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        int result2 = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        int result3 = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        int result4 = NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


        boolean result5 = NumberOfDaysInMonth.isLeapYear(-1600);
        boolean result6 = NumberOfDaysInMonth.isLeapYear(1600);
        boolean result7 = NumberOfDaysInMonth.isLeapYear(2017);
        boolean result8 = NumberOfDaysInMonth.isLeapYear(2000);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        */

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        /*for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }*/

        /*for(int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }*/



        /*        int primeCounter = 0;
        for (int i=10; i<50; i++){
            if(isPrime(i)) {
                primeCounter++;
                System.out.println("Number " + i + " is a prime number");
                if(primeCounter == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }*/






        /*
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                System.out.println("found number " + i);
                count++;
            }

            if (count == 5) {
                break;
            }

        }
        System.out.println("sum = "+ sum);
*/




        /*     while exercise
        int count = 0;
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }*/




        /*int result = SumOdd.sumOdd(100, 1000);
        System.out.println(result);
        */


       /* int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even number found = " + evenNumbersFound);*/



        /* System.out.println("The sum of the digits in number 125 is " + DigitSumChallenge.sumDigits(125));
        System.out.println("The sum of the digits in number 125 is " + DigitSumChallenge.sumDigits(2343435));
        System.out.println("The sum of the digits in number 125 is " + DigitSumChallenge.sumDigits(-124));*/



/*      System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));*/



/*      System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(252));*/


/*        System.out.println(EvenDigitSum.getEvenDigitSum(12343549));*/

        System.out.println(SharedDigit.hasSharedDigit(9, 28));
    }




        public static boolean isPrime(int n){
            if(n == 1){
                return false;
            }

            // (long) Math.sqrt(n)
            for (int i=2; i <= n/2; i++){
                System.out.println("Looping " + i);
                if(n % 1 == 0){
                    return false;
                }
            }
            return true;
        }




        public static double calculateInterest(double aumont, double interestRate){
            return (aumont * (interestRate / 100));
        }


        public static boolean isEvenNumber(int num){
            if(num % 2 == 0){
                return true;
            } else {
                return false;
            }
        }


    }


