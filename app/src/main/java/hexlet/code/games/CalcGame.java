package hexlet.code.games;

import hexlet.code.Cli;

public class CalcGame {
    private static int correctAnswer;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("What is the result of the expression?");
    }

    public static void question() {
        // for operation
        final int MIN = 1;
        final int MAX = 3;
        int randNumForOperation = MIN + (int) (Math.random() * MAX);

        // numbers
        final int minNum = 1;
        final int maxNum = 10;
        int num1 = minNum + (int) (Math.random() * maxNum);
        int num2 = minNum + (int) (Math.random() * maxNum);

        switch (randNumForOperation) {
            case 1:
                correctAnswer = num1 + num2;
                System.out.println(num1 + " + " + num2);
                break;
            case 2:
                correctAnswer = num1 - num2;
                System.out.println(num1 + " - " + num2);
                break;
            case 3:
                correctAnswer = num1 * num2;
                System.out.println(num1 + " * " + num2);
                break;
            default:
                break;
        }
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
}
