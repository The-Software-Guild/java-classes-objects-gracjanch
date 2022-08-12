package basic.programing.assessment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int numberOfRounds;
        int userIntAnswer;
        String userStrAnswer;
        int userScore = 0;
        int computerScore = 0;
        int tie = 0;
        int counterOfRounds = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose number of rounds: (1-10)");
            numberOfRounds = intFromUser(scanner);
            if (numberOfRounds > 10 || numberOfRounds < 1) {
                System.out.println("Error! Wrong number of rounds!");
            } else {
                do {
                    System.out.println("#####################" +
                            "\nRound: " + counterOfRounds);
                    counterOfRounds++;
                    System.out.println("Choose: \n[1] Rock \n[2] Paper \n[3] Scissors: ");
                    userIntAnswer = intFromUser(scanner);
                    int randomNumber = randomNumber();

                    if (userIntAnswer == randomNumber) {
                        tie++;
                        System.out.println("Tie!");
                    } else if ((userIntAnswer == 1 && randomNumber == 3)
                            || (userIntAnswer == 2 && randomNumber == 1)
                            || (userIntAnswer == 3 && randomNumber == 2)) {
                        userScore++;
                        System.out.println("User Win!");
                    } else {
                        computerScore++;
                        System.out.println("Computer Win!");
                    }
                    System.out.println("Score: Ties: " + tie +
                            " User wins: " + userScore +
                            " Computer wins: " + computerScore);
                } while (counterOfRounds <= numberOfRounds);
            }
            System.out.println("#####################");
            System.out.println("Do you want to play again? \nType yes or no");
            userStrAnswer = scanner.nextLine();
        } while (!userStrAnswer.equalsIgnoreCase("NO"));
    }

    private static int intFromUser(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(3 - 1) + 1;
        return randomNumber;
    }
}
