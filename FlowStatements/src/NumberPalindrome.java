public class NumberPalindrome {
    public static boolean isPalindrome(int number){

            int reverse = 0;
            int origin = number;
            while(number != 0){
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;
            }
            return origin == reverse;
        }


        /*if(number < 0){
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored != 0){

//            extract the least-significant digit
            int digit = number % 10;
            reverse = (reverse * 10) + digit;

//            drop the least-significant digit
            stored /= 10;
        }

        if(reverse == number){
            return true;
        }else {
            return false;
        }
    */
    }


