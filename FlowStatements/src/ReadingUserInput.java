import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
//  scanner allows to read an input, with new Scanner we create a new instance Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

    //  check in the next int is a number, if is qualified as an int
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");

    //  write the name in the input line
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }else {
                System.out.println("Invalid year of birth");
            }

        }else {
            System.out.println("Unable to parse year of birth");
        }


    //  we sum up the function above it, and we close the scanner process
        scanner.close();
    }
}
