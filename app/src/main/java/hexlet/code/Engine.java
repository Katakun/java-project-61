package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgresGame;
import hexlet.code.games.PrimeGame;
import java.util.Scanner;
public class Engine {
    private static final int GREET_MENU_ITEM = 1;
    private static final int EVEN_MENU_ITEM = 2;
    private static final int CALC_MENU_ITEM = 3;
    private static final int GCD_MENU_ITEM = 4;
    private static final int PROGRESSION_MENU_ITEM = 5;
    private static final int PRIME_MENU_ITEM = 6;

    private static final int QUESTION_COUNT = 3;

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isWin = false;
    public static void startGame(int gameNumber) {
        // Приветсвие
        if (gameNumber == GREET_MENU_ITEM) {
            Cli.helloUser();
        } else if (gameNumber != 0) {
            // Вывод условий игры
            if (gameNumber == EVEN_MENU_ITEM) {
                EvenGame.showGameRules();
            } else if (gameNumber == CALC_MENU_ITEM) {
                CalcGame.showGameRules();
            } else if (gameNumber == GCD_MENU_ITEM) {
                GcdGame.showGameRules();
            } else if (gameNumber == PROGRESSION_MENU_ITEM) {
                ProgresGame.showGameRules();
            } else if (gameNumber == PRIME_MENU_ITEM) {
                PrimeGame.showGameRules();
            }

            // Цикл вопросов из выбранной игры 3 раза
            for (int i = 0; i < QUESTION_COUNT; i++) {
                // вопрос
                System.out.print("Question: ");
                if (gameNumber == EVEN_MENU_ITEM) {
                    EvenGame.question();
                } else if (gameNumber == CALC_MENU_ITEM) {
                    CalcGame.question();
                } else if (gameNumber == GCD_MENU_ITEM) {
                    GcdGame.question();
                } else if (gameNumber == PROGRESSION_MENU_ITEM) {
                    ProgresGame.question();
                } else if (gameNumber == PRIME_MENU_ITEM) {
                    PrimeGame.question();
                }

                // ответ
                System.out.print("Your answer: ");
                String answer = scanner.next();

                // проверка
                if (gameNumber == EVEN_MENU_ITEM && EvenGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == CALC_MENU_ITEM && CalcGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == GCD_MENU_ITEM && GcdGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == PROGRESSION_MENU_ITEM && ProgresGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == PRIME_MENU_ITEM && PrimeGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else {
                    isWin = false;
                    break;
                }
            }
            if (isWin) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            } else {
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                isWin = false;
            }
        }
    }
}
