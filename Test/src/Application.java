public class Application {
    public static void main(String[] args) {
        System.out.println(divide(5.0f, 2.0f));
        System.out.println(divide(5, 0));
        System.out.println("Angelo");
    }
    public static float divide(float num1, float num2) {
        return num1 / num2;
    }
    public static String divide(int num1, int num2) {
        if (num2 == 0) {
            return "cannot divide by zero";
        } else {
            return Integer.toString(num1 / num2);
        }
    }
}
