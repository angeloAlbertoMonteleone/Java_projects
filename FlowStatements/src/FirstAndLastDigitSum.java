public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;

        System.out.println("last digit " + lastDigit);
        while(number != 0){
             firstDigit = number % 10;
             number /= 10;

        }
        System.out.println("first digit " + firstDigit);
            return lastDigit + firstDigit;
    }
}
