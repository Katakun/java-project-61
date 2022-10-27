package hexlet.code.games;

import hexlet.code.Cli;

public class PrimeGame {
    public static int questNumber;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void question() {
        int min = 1, max = 50;
        questNumber = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(questNumber);
    }

    public static boolean isAnswerCorrect(String answer) {
        answer = answer.toLowerCase();
        String correctAnswer = isPrime(questNumber) ? "yes" : "no";
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

    private static boolean isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
