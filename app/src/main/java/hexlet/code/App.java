package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet \n"
                        + "2 - Even \n"
                        + "3 - Calc \n"
                        + "4 - GDC \n"
                        + "5 - Progression \n"
                        + "0 - Exit\n"
                        + "Your choice: ");
        int userChoise = scanner.nextInt();
        Engine.startGame(userChoise);
    }
}
