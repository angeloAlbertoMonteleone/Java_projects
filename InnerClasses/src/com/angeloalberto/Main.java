package com.angeloalberto;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I have been attached");
//            }
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());


        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();


        //        Gearbox mcLaren = new Gearbox(6);
////        mcLaren.addGear(1,5.3);
////        mcLaren.addGear(3,10.3);
////        mcLaren.addGear(2,8.3);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

        //        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear second = mcLaren.new Gear(2, 20.3);
//        Gearbox.Gear third = mcLaren.new Gear(4, 18.3);
//        // not new mcLaren.Gear(...)
//        System.out.println(first.driveSpeed(1000));


    }

    public static void listen() {
        boolean quit = false;

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
