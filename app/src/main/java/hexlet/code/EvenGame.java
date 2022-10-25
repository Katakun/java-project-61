package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    static void start() {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 50;
        boolean isWin = false;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = min + (int) (Math.random() * ((max - min) + 1));
            System.out.print("Question: " + randomNumber + "\nYour answer: ");
            String userAnswer = scanner.next().toLowerCase();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                isWin = true;
            } else {
                System.out.print(userAnswer + " is wrong answer ;(. Correct answer was "
                        + correctAnswer + "! ");
                isWin = false;
                break;
            }
        }
//        scanner.close();
        if (isWin) {
            Cli.winMessage();
        } else {
            Cli.failMessage();
        }
    }
}
