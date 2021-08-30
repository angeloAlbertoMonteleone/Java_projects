package com.angeloalberto.challenge;

public class Printer {
    public int tonerLevel;
    public int numberOfPagesPrinted = 0;

    public boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.isDuplexPrinter = isDuplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public int fillUpToner(int tonerAmount) {
        if (this.tonerLevel > 0 && this.tonerLevel <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("You have " + this.tonerLevel + "% of toner available");
            return this.tonerLevel;
        }else if (this.tonerLevel == 100) {
            System.out.println("Tonel level is already at 100 %");
            return this.tonerLevel;
        } else {
            return -1;
        }
    }


    public int printingApage(int pages){
        int pagesToPrint = pages;
        if(this.isDuplexPrinter){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
