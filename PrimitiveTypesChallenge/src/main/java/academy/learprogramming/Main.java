package academy.learprogramming;

public class Main {
    public static void main(String[] args) {
        byte exerciseByte = 126;
        short exerciseShort = 23056;
        int exerciseInt = 59353953;
        long exerciseLong = 50000L + (10L * (exerciseByte + exerciseShort + exerciseInt));

        System.out.println(exerciseLong);

        short shortTotal = (short) (1000 + 10 * (exerciseByte +exerciseShort + exerciseInt));
    }
}
