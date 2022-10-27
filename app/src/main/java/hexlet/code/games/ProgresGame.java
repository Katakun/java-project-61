package hexlet.code.games;

import hexlet.code.Cli;

public class ProgresGame {
    private static int correctAnswer;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("What number is missing in the progression?");
    }

    public static void question() {
        // for step
        final int minStep = 2;
        final int maxStep = 5;
        int step = minStep + (int) (Math.random() * maxStep);

        // for length progression
        final int minLength = 5;
        final int maxLength = 10;
        int length = minLength + (int) (Math.random() * maxLength);

        int hideIndex = 0 + (int) (Math.random() * length);

        // for start number
        final int minSTart = 0;
        final int maxStart = 15;
        int startNum = minSTart + (int) (Math.random() * maxStart);

        int num = startNum;
        for (int i = 0; i < length; i++) {
            if (i == hideIndex) {
                System.out.print(".. ");
                correctAnswer = num;
                num += step;
                continue;
            }
            System.out.print(num + " ");
            num += step;
        }
        System.out.print("\n");
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
