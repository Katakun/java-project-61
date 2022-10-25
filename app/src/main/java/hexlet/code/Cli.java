package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String userName;
    static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
//        scanner.close();
    }
    static void failMessage() {
        System.out.println("Let's try again, " + userName + "!");
    }
    static void winMessage() {
        System.out.println("Congratulations, " +  userName + "!");
    }
}
