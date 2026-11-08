import controller.Cabinet;
import menu.Menu;
import java.util.Scanner;

public class Main {
    private static final Menu menu = new Menu();
    private static final Cabinet cabi = new Cabinet();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabi.task1();
        cabi.task7("LOADING GAME");
        cabi.task2();
        int c;
        do{
            menu.mainMenu();
            c = inputNumber();
            switch(c){
                case 1:
                    cabi.task3();
                    menu.racingMenu();
                    cabi.task7("RACING");
                    cabi.task4();
                    cabi.task5();
                    cabi.task6();
                    break;
            }
        }while(c != 0);
    }

    public static int inputNumber() {
        int num = 0;
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num >= 0)
                    break;
                else
                    System.out.println("Number must be integer and greater equal 0 !!!");
            } catch (NumberFormatException e) {
                System.out.println("Number must be integer and greater equal 0 !!!");
            }
        }
        return num;
    }
}