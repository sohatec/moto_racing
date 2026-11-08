package menu;

public class Menu {

    public void bannerMenu(){
        String banner = """
                 ███████╗ ██████╗ ██╗  ██╗ █████╗ ████████╗███████╗ ██████╗
                 ██╔════╝██╔═══██╗██║  ██║██╔══██╗╚══██╔══╝██╔════╝██╔════╝
                 ███████╗██║   ██║███████║███████║   ██║   █████╗  ██║
                 ╚════██║██║   ██║██╔══██║██╔══██║   ██║   ██╔══╝  ██║
                 ███████║╚██████╔╝██║  ██║██║  ██║   ██║   ███████╗╚██████╗
                 ╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   ╚══════╝ ╚═════╝
               
                 ███╗   ███╗ ██████╗ ████████╗ ██████╗      ██████╗ ██████╗ 
                 ████╗ ████║██╔═══██╗╚══██╔══╝██╔═══██╗    ██╔════╝ ██╔══██╗
                 ██╔████╔██║██║   ██║   ██║   ██║   ██║    ██║  ███╗██████╔╝
                 ██║╚██╔╝██║██║   ██║   ██║   ██║   ██║    ██║   ██║██╔═══╝ 
                 ██║ ╚═╝ ██║╚██████╔╝   ██║   ╚██████╔╝    ╚██████╔╝██║     
                 ╚═╝     ╚═╝ ╚═════╝    ╚═╝    ╚═════╝      ╚═════╝ ╚═╝     
                """;
        System.out.println("\n\n");
        System.out.println(banner);
    }

    public void racingMenu(){
        System.out.println("                                 ==                                                         ");
        System.out.println("                               \\\\  _                                                    |   ");
        System.out.println("                         :''''')\\\\(_|                                                  /|   ");
        System.out.println("          /-----._____._____/  \\\\                                                     /_|   ");
        System.out.println("         /        \\   |  === |   \\\\                                                  /__|   ");
        System.out.println("       .:'':.  \\ /   |=\\ /   .\\\\':.                                                 /___|   ");
        System.out.println("      :' .. '-':--'..'' / /   :' \\\\ ':                                             /____|   ");
        System.out.println("      '  .. .-'--:.....:/    '. '' .'                                                   |   ");
        System.out.println("_______':..:'________________':..:'_____________________________________________________|_____________");
    }

    public void mainMenu(){
        System.out.println("");
        System.out.println("====================");
        System.out.println("| (1) Enroll Game  |");
        System.out.println("| (0) Logout Game  |");
        System.out.println("====================");
    }

    public void greetMenu(){
        System.out.println("_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_\n");
        System.out.println("\t\tWELCOME TO MOTOR GP\n" + "\t\t  🏆🏆🏆 CHAMPION 🏆🏆🏆");
    }

    public void showResultFormationLapMenu(){
        System.out.println("\n<<<<<-----Formation lap----->>>>>");
        System.out.println("|Brand     |Racer     |No   |Speed   |");
    }

    public void sortSpeedOpeningLapMenu(){
        System.out.println("\n<<<<<-----Opening lap----->>>>>");
        System.out.println("|Brand     |Racer     |No   |Speed   |");
    }

    public void championMenu(){
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║    🏆 🏆 🏆 THE CHAMPION 🏆 🏆 🏆    ║");
        System.out.println("╚═══════════════════════════════════════╝");
    }

    public void brandMenu(){
        System.out.println("====================");
        System.out.println("|  Choosing Brand  |");
        System.out.println("====================");
        System.out.println("| (1) Ducati       |");
        System.out.println("| (2) Yamaha       |");
        System.out.println("| (3) Honda        |");
        System.out.println("| (4) Aprilia      |");
        System.out.println("====================");
    }
}
