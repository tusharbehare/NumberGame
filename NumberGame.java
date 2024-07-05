import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int upperBound = 100; // You can adjust the upper bound of the random number here
        int randomNumber = random.nextInt(upperBound) + 1; // Generate random number between 1 and upperBound
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and " + upperBound + ".");
        System.out.println("Try to guess it!");

        int guess;
        int attempts = 0;
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
    }
}
