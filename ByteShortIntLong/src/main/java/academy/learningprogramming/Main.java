package academy.learningprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinInValue = Integer.MIN_VALUE;
        int myMaxInValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinInValue);
        System.out.println("Integer Maximum Value " + myMaxInValue);
        System.out.println("Integer Busted MAX Value " + (myMaxInValue + 1));
        System.out.println("Integer Busted MIN Value " + (myMinInValue - 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum Value = " + myMinByteValue);
        System.out.println("Byte maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum Value = " + myMinShortValue);
        System.out.println("Short maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum Value = " + myMinLongValue);
        System.out.println("Long maximum Value = " + myMaxLongValue);

        int myTotal = (myMinInValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        
    }
}
