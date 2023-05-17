import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		Scanner input = new Scanner(System.in);
		int guess;
		do {
			System.out.print("Guess a number between 1 and 100: ");
			guess = input.nextInt();
			if (guess < randomNumber) {
				System.out.println("Too low, try again.");
			} else if (guess > randomNumber) {
				System.out.println("Too high, try again.");
			} else {
				System.out.println("You guessed it!");
			}
		} while (guess != randomNumber);
	}
}