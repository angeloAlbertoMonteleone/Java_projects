public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int leftnum1 = num1 / 10;
            int rightnum1 = num1 % 10;
            int leftnum2 = num2 / 10;
            int rightnum2 = num2 % 10;

            if ((leftnum1 == leftnum2) || (leftnum1 == rightnum2) || (rightnum1 == rightnum2) || (rightnum1 == leftnum2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
