package hexlet.code.games;

import hexlet.code.Cli;

public class GcdGame {
    private static int correctAnswer;
    private static int num1;
    private static int num2;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void question() {
        // numbers
        final int minNum = 1;
        final int maxNum = 50;
        num1 = minNum + (int) (Math.random() * maxNum);
        num2 = minNum + (int) (Math.random() * maxNum);
        correctAnswer = gcd(num1, num2);
        System.out.println(num1 + " " + num2);
    }

    public static boolean isAnswerCorrect(String answer) {
        int userAnswerInt = Integer.parseInt(answer);
        if (userAnswerInt == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer
                    + " is wrong answer ;(. Correct answer was "
                    + correctAnswer);
            return false;
        }
    }

    private static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }





}
