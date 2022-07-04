import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // random guess number generated
        Random rand    = new Random();
        int guess;
        String play_again;
        // Keyboard Scanner
        Scanner sc = new Scanner(System.in);
        while (true) {
            int secret_num = rand.nextInt(20);
            int num_tries  = 0;
            System.out.println("secret num = " + secret_num);
            System.out.println("Hello! What is your name?");
            String name = sc.next();
            System.out.println(name);
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20");
            // Added sample comments here
            while(true) {
                if (num_tries > 6) {
                    System.out.println("Maximum 6 tries, sorry!");
                    break;
                }
                System.out.println("Take a guess");
                guess = sc.nextInt();
                num_tries++;
                if (guess < 1 || guess > 20) {
                    System.out.println("Wrong selection!");
                } else if (guess == secret_num) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + num_tries + " guesses");
                    break;
                } else if (guess < secret_num) {
                    System.out.println("Guess is too low!");
                } else if (guess > secret_num) {
                    System.out.println("Guess is too high!");
                }
            }
            System.out.println("Do you want to play again? (y or no)");
            play_again = sc.next();
            System.out.println(play_again);
            if (play_again  != "n") {
                break;
            }

        }
    }
}
