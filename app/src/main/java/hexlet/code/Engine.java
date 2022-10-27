package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgresGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;
public class Engine {
    private static int greetMenuItem = 1;
    private static int eventMenuItem = 2;
    private static int calcMenuItem = 3;
    private static int gcdtMenuItem = 4;
    private static int progressionMenuItem = 5;
    private static int primeMenuItem = 6;

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isWin = false;
    public static void startGame(int gameNumber) {
        // Приветсвие
        if (gameNumber == greetMenuItem) {
            Cli.helloUser();
        } else if (gameNumber != 0) {
            // Вывод условий игры
            if (gameNumber == eventMenuItem) {
                EvenGame.showGameRules();
            } else if (gameNumber == calcMenuItem) {
                CalcGame.showGameRules();
            } else if (gameNumber == gcdtMenuItem) {
                GcdGame.showGameRules();
            } else if (gameNumber == progressionMenuItem) {
                ProgresGame.showGameRules();
            } else if (gameNumber == primeMenuItem) {
                PrimeGame.showGameRules();
            }

            // Цикл вопросов из выбранной игры 3 раза
            for (int i = 0; i < 3; i++) {
                // вопрос
                System.out.print("Question: ");
                if (gameNumber == eventMenuItem) {
                    EvenGame.question();
                } else if (gameNumber == calcMenuItem) {
                    CalcGame.question();
                } else if (gameNumber == gcdtMenuItem) {
                    GcdGame.question();
                } else if (gameNumber == progressionMenuItem) {
                    ProgresGame.question();
                } else if (gameNumber == primeMenuItem) {
                    PrimeGame.question();
                }

                // ответ
                System.out.print("Your answer: ");
                String answer = scanner.next();

                // проверка
                if (gameNumber == eventMenuItem && EvenGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == calcMenuItem && CalcGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == gcdtMenuItem && GcdGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == progressionMenuItem && ProgresGame.isAnswerCorrect(answer)) {
                    isWin = true;
                } else if (gameNumber == primeMenuItem && PrimeGame.isAnswerCorrect(answer)) {
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