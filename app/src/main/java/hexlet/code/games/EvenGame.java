package hexlet.code.games;

import hexlet.code.Cli;
public class EvenGame {
    public static int questNumber;
    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static void question() {
        int min = 0;
        int max = 50;
        questNumber = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(questNumber);
    }

    public static boolean isAnswerCorrect(String answer) {
        answer = answer.toLowerCase();
        String correctAnswer = questNumber % 2 == 0 ? "yes" : "no";
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer
                    + " is wrong answer ;(. Correct answer was "
                    + correctAnswer);
            return false;
        }
    }

//        scanner.close();
}
