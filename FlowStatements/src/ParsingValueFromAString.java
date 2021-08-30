public class ParsingValueFromAString {
    public static void main(String[] args) {
        String numberAsString = "2018";

        int number = Integer.parseInt(numberAsString);
//        double number = Double.parseDouble(numberAsString);
        System.out.println("number = "+ number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }
}
