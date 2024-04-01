import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    public static void main(String[] args) {
                Scanner scanner =new Scanner(System.in);
                Random random =new Random();
                int lowerBound =1;
                int upperBound =100;
                int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                int maxAttempts =5;
                int score =0;
                System.out.println("Welcome to Guess the Number!");
                System.out.println("Guess the number between " + lowerBound + " and " + upperBound);
                for (int attempt =1; attempt <= maxAttempts; attempt++) {
                    System.out.print("Attempt " + attempt + ": Enter your guess: ");
                    int userGuess = scanner.nextInt();

                    if (userGuess == generatedNumber) {
                        System.out.println("Congratulations! You guessed the number!");
                        score += (maxAttempts - attempt + 1) * 10;
                        break;
                    } else if (userGuess < generatedNumber) {
                        System.out.println("Too low. Try again!");
                    } else {
                        System.out.println("Too high. Try again!");
                    }
                    if (attempt == maxAttempts) {
                        System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);
                    }
                }

                System.out.println("Your score: " + score);
                scanner.close();
            }
        }