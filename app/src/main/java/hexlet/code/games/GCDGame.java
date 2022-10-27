package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Arrays;

public class GCDGame {
    public static int correctAnswer;
    private static int num1;
    private static int num2;

    public static void showGameRules() {
        Cli.helloUser();
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void question() {
        // numbers
        int minNum = 1, maxNum = 50;
        num1 = minNum + (int) (Math.random() * maxNum);
        num2 = minNum + (int) (Math.random() * maxNum);
        correctAnswer = GCD(num1, num2);
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

    private static int GCD(int num1, int num2) {
        int[] dividers1 = simpleDivs(num1);
        int[] dividers2 = simpleDivs(num2);
        int[] sameDiv = new int[Math.max(dividers1.length, dividers2.length)];
        int count = 0;
        int gdc = 1;

        for (int i = 0; i < dividers1.length; i++) {
            for (int j = 0; j < dividers2.length; j++) {
                if (dividers1[i] == dividers2[j]) {
                    sameDiv[i] = dividers1[i];
                    count++;
                }
            }
        }
        sameDiv = Arrays.copyOf(sameDiv, count);
        int[] uniqSameDivs = removeDuplicates(sameDiv);
        for (int div : uniqSameDivs) {
            gdc *= div;
        }
        return gdc;
    }

    private static int[] removeDuplicates (int[] arr) {
        int count = 0;
        int[] uniqArr = new int[arr.length];
        // arr is sorted
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqArr[count++] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(uniqArr, count);
    }

    private static int[] simpleDivs(int num) {
        int divider = 2;
        int[] dividers = new int[100];
        int count = 0;
        while (num > 1) {
            if (num % divider == 0) {
                dividers[count] = divider;
                num = num / divider;
                count++;
            } else {
                divider++;
            }
        }
        return Arrays.copyOf(dividers, count);
    }

}
