package hexlet.code.games;

import hexlet.code.Cli;

public class CalcGame {
    private static int correctAnswer;
    private static final int MIN_CALC_OPERATOR = 1;
    private static final int MAX_CALC_OPERATOR = 3;
    private static final int MIN_CALC_OPERAND = 1;
    private static final int MAX_CALC_OPERAND = 10;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("What is the result of the expression?");
    }

    public static void question() {
        // for operation
        int randNumForOperation = MIN_CALC_OPERATOR + (int) (Math.random() * MAX_CALC_OPERATOR);
        // numbers
        int num1 = MIN_CALC_OPERAND + (int) (Math.random() * MAX_CALC_OPERAND);
        int num2 = MIN_CALC_OPERAND + (int) (Math.random() * MAX_CALC_OPERAND);
        // calculator question
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
