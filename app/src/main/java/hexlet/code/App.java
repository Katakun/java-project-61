package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet \n"
                        + "2 - Even \n"
                        + "0 - Exit\n"
                        + "Your choice: ");
        int userChoise = scanner.nextInt();
        switch (userChoise) {
            case 1:
                Cli.helloUser();
                break;
            case 2:
                Cli.helloUser();
                EvenGame.start();
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
