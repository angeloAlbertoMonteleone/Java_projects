import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int min = 0; // 2147483647 // Integer.MAX_VALUE
        int max = 0; // - 2147483648 // Integer.MIN_VALUE
        boolean first = true; // we comment this

        while (counter < 3){

            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                counter++;
                int number = scanner.nextInt();

                //we comment first
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max){
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            }else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("The maximum value is : " + max + " and the minimum value is : " + min);
        scanner.close();


    }
}
