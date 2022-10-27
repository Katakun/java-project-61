/*
* Требования к проекту
В проекте нет необходимости использовать абстрактные классы,
* интерфейсы, наследование, инстансы классов. Поставленные
* задачи легко решаются без них, используйте статические методы
* и свойства.
* */
package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgresGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;
public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isWin = false;
    public static void startGame(int gameNumber) {
        // Приветсвие
        if (gameNumber == 1) {
            Cli.helloUser();
        } else {
            // Вывод условий игры
            if (gameNumber == 2) {
                EvenGame.showGameRules();
            } else if (gameNumber == 3) {
                CalcGame.showGameRules();
            } else if (gameNumber == 4) {
                GcdGame.showGameRules();
            } else if (gameNumber == 5) {
                ProgresGame.showGameRules();
            } else if (gameNumber == 6) {
                PrimeGame.showGameRules();
            }

            // Цикл вопросов из выбранной игры 3 раза
            for (int i = 0; i < 3; i++) {
                // вопрос
                System.out.print("Question: ");
                if (gameNumber == 2) {
                    EvenGame.question();
                } else if (gameNumber == 3) {
                    CalcGame.question();
                } else if (gameNumber == 4) {
                    GcdGame.question();
                } else if (gameNumber == 5) {
                    ProgresGame.question();
                } else if (gameNumber == 6) {
                    PrimeGame.question();
                }

                // ответ
                System.out.print("Your answer: ");
                String answer = scanner.next();

                // проверка
                if (gameNumber == 2) {
                    if (EvenGame.isAnswerCorrect(answer)) {
                        isWin = true;
                    } else {
                        System.out.println("Let's try again, " + Cli.userName);
                        isWin = false;
                        break;
                    }
                } else if (gameNumber == 3) {
                    if (CalcGame.isAnswerCorrect(answer)) {
                        isWin = true;
                    } else {
                        System.out.println("Let's try again, " + Cli.userName);
                        isWin = false;
                        break;
                    }
                } else if (gameNumber == 4) {
                    if (GcdGame.isAnswerCorrect(answer)) {
                        isWin = true;
                    } else {
                        System.out.println("Let's try again, " + Cli.userName);
                        isWin = false;
                        break;
                    }
                } else if (gameNumber == 5) {
                    if (ProgresGame.isAnswerCorrect(answer)) {
                        isWin = true;
                    } else {
                        System.out.println("Let's try again, " + Cli.userName);
                        isWin = false;
                        break;
                    }
                } else if (gameNumber == 6) {
                    if (PrimeGame.isAnswerCorrect(answer)) {
                        isWin = true;
                    } else {
                        System.out.println("Let's try again, " + Cli.userName + "!");
                        isWin = false;
                        break;
                    }
                }
            }
            if (isWin) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        }
    }
}
