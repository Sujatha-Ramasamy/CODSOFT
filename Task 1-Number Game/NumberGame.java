import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int totalScore = 0;
        int roundsPlayed = 0;

        System.out.println("Welcome to the Number Guessing Game!!");

        boolean playAgain = true;
        while (playAgain) {
            int target = rand.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == target) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1); 
                    guessedCorrectly = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all attempts. The correct number was: " + target);
            }

            roundsPlayed++;
            System.out.println("Score: " + totalScore + " | Rounds played: " + roundsPlayed);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");
        }

       System.out.println("\nThanks for playing! Final score: " + totalScore +" in "+roundsPlayed + " rounds. ");
       sc.close();
    }

}