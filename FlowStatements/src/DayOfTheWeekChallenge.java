public class DayOfTheWeekChallenge {
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not day");
                break;
        }
    }




    public static void printDayOfTheWeekIfElse(int day) {
        if(day == 0){
            System.out.println("Sunday");
        }else if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Saturday");
        }else {
            System.out.println("Not days");
        }

    }


}
