public class YearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {

            long minutesInYear = 60 * 24 * 365;

            long years = (long) (minutes / minutesInYear);

            int days = (int) (minutes / 60 / 24) % 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
