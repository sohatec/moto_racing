package controller;

import data.DataRacing;
import menu.Menu;

public class Cabinet {

    DataRacing dt = new DataRacing();
    Menu menu = new Menu();

    // Pass data into RacingManager class to all functions use
    RacingManager rm = new RacingManager(dt.getDataMotoGp(), dt.getDataRacer());

    // Task1
    public void task1(){
        menu.bannerMenu();
    }

    // Task2
    public void task2(){
        menu.greetMenu();
        rm.greet();
    }

    // Task3
    public void task3(){
        rm.addRacer();
    }

    // Task4
    public void task4(){
        menu.showResultFormationLapMenu();
        rm.showResultFormationLap();
    }

    // Task5
    public void task5(){
        rm.sortSpeedOpeningLap();
    }

    // Task6
    public void task6(){
        rm.champion();
   }

   // Task7
    public void task7(String text){
        rm.countDown(text);
    }
}
