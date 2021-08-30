public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        int newNum1 =(int)Math.round(num1 * 1000);


        int newNum2 = (int)Math.round(num2 * 1000);


        if(newNum1 - newNum2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
