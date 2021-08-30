package com.angeloalberto.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
        int printedPage = printer.printingApage(5);

        System.out.println("Pages Printed was = " + printedPage + ", new total print count for printer = " + printer.getNumberOfPagesPrinted());

        printedPage = printer.printingApage(10);
        System.out.println("Pages Printed was = " + printedPage + ", new total print count for printer = " + printer.getNumberOfPagesPrinted());

    }
}
