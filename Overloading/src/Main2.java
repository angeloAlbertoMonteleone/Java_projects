public class Main2 {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65l,45l));
        System.out.println(getDurationString(3945l));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(long minutes, long seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if(hours < 10){
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if(remainingMinutes < 10){
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if(seconds < 10){
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString + "";
        }else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(long seconds){
        if(seconds >= 0){
            long minutes = seconds / 60;
            long remaingSeconds = seconds % 60;
            String x = getDurationString(minutes, remaingSeconds);
            return x;
        }else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
