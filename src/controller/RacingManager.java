package controller;

import entity.*;
import menu.Menu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RacingManager {

    private final Scanner sc = new Scanner(System.in);
    private final Menu menu = new Menu();
    private final List<MotoGp> dataMotoGp;
    private final List<Racing> dataRacer;

    public RacingManager(List<MotoGp> dataMotoGp, List<Racing> dataRacer) {
        this.dataMotoGp = dataMotoGp;
        this.dataRacer = dataRacer;
    }

    public void greet() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }

    public void addRacer() {
        dataMotoGp.clear();
        dataRacer.clear();
        System.out.print("\nInput amount of racer: ");
        int amount = inputNumber();
        for (int i = 0; i < amount; i++) {
            System.out.println("\nInput racer #" + (i + 1) + ".");
            String brand = inputBrandMoto();
            String name = inputNameRacer();
            System.out.println("Input No of racer:");
            int no = inputNumber();
            switch (brand) {
                case "Ducati":
                    dataMotoGp.add(new Ducati(brand, name, no));
                    break;
                case "Yamaha":
                    dataMotoGp.add(new Yamaha(brand, name, no));
                    break;
                case "Honda":
                    dataMotoGp.add(new Honda(brand, name, no));
                    break;
                case "Aprilia":
                    dataMotoGp.add(new Aprilia(brand, name, no));
                    break;
            }
        }
    }

    public void showResultFormationLap() {
        for (MotoGp m : dataMotoGp)
            m.showResultFormationLap();
    }

    public void sortSpeedOpeningLap() {
        for (MotoGp m : dataMotoGp)
            dataRacer.add(new Racing(m, m.racingOpeningLap()));
        dataRacer.sort((a, b) -> Double.compare(b.getSpeed(), a.getSpeed()));
        menu.sortSpeedOpeningLapMenu();
        for (Racing rws : dataRacer)
            rws.getMotor().showResultOpeningLap(rws.getSpeed());
    }

    public void champion() {
        if (dataRacer.isEmpty()) {
            System.out.println("No racers are evaluated yet!");
            return;
        }
        Racing champ = dataRacer.get(0);
        System.out.println(" ");
        menu.championMenu();
        System.out.printf(" Brand : %-10s\n", champ.getMotor().getBrand());
        System.out.printf(" Racer : %-10s\n", champ.getMotor().getRacer());
        System.out.printf(" No    : %-5d\n", champ.getMotor().getNo());
        System.out.printf(" Speed : %-8.2f km/h\n", champ.getSpeed());
    }

    public void countDown(String text) {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.print("\r" + text + ":  " + i + " ..........");
                if (i > 0) {
                    Thread.sleep(1000);
                }
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int inputNumber() {
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0)
                    break;
                else
                    System.out.println("Number must be integer and greater than 0 !!!");
            } catch (NumberFormatException e) {
                System.out.println("Number must be integer and greater than 0 !!!");
            }
        }
        return num;
    }

    public String inputBrandMoto() {
        while (true) {
            menu.brandMenu();
            int c = inputNumber();
            switch (c) {
                case 1:
                    return "Ducati";
                case 2:
                    return "Yamaha";
                case 3:
                    return "Honda";
                case 4:
                    return "Aprilia";
            }
        }
    }

    public String inputNameRacer() {
        System.out.println("Input name of racer.");
        return sc.nextLine();
    }
}