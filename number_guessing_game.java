import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//EASY LEVEL://no warning,validation
//public class NumberGuessingGame {
//    public static void main(String[] args) {
//
//        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        int secretNumber = rand.nextInt(1001); // 0–1000
//        int guesses = 10;
//
//        System.out.println("Welcome to Number Guessing Game!");
//        System.out.println("Guess a number between 0 and 1000");
//
//        // Simple loop
//        while (guesses > 0) {
//
//            System.out.println("\nGuesses left: " + guesses);
//            System.out.print("Enter your guess: ");
//
//            int userGuess = sc.nextInt(); // no validation (beginner level)
//
//            if (userGuess == secretNumber) {
//                System.out.println("Correct! You win!");
//                break;
//            }
//            else if (userGuess < secretNumber) {
//                System.out.println("Too small!");
//            }
//            else {
//                System.out.println("Too big!");
//            }
//
//            guesses--;
//        }
//
//        if (guesses == 0) {
//            System.out.println("You lost! Number was: " + secretNumber);
//        }
//    }
//}
//INTERMEDIATE LEVEL:
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class number_guessing_game
//{
//    public static void main(String[] args)
//    {
//        System.out.println("Welcome to number guessing game!");
//        System.out.println("I'm thinking of a number between 0-1000");
//        System.out.println("You have one warning.");
//        System.out.println("---------------------------------------");
//        Random rand=new Random();
//        int guess=rand.nextInt(1001);
//
//        Scanner sc=new Scanner(System.in);
//
//        int warnings=1;
//
//        ArrayList<Integer> guessedNumbers = new ArrayList<>();
//        for (int i=10;i>0;i--)
//        {
//            System.out.println("You have "+i+"guesses left.");
//            System.out.print("Guessed numbers: ");
//            for (int num : guessedNumbers) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//            System.out.print("Enter a guess:");
//            // invalid input check
//            if (!sc.hasNextInt()) {
//                sc.next();
//                if (warnings > 0) {
//                    warnings--;
//                    System.out.println("Invalid input! Warning left: " + warnings);
//                    i++; // don't reduce guess
//                } else {
//                    System.out.println("Invalid input! You lost a guess.");
//                }
//                continue;
//            }
//
//            int user_guess = sc.nextInt();//if we write it before input check program crashes.
//            // repeated guess
//            if (guessedNumbers.contains(user_guess)) {
//                if (warnings > 0) {
//                    warnings--;
//                    System.out.println("Repeated guess! Warning left: " + warnings);
//                    i++;
//                } else {
//                    System.out.println("Repeated guess! You lost a guess.");
//                }
//                continue;
//            }
//            guessedNumbers.add(user_guess);
//            if (user_guess==guess)
//            {
//                System.out.println("Congratulations!Your guess is correct.");
//                break;
//            }
//            else if(user_guess<guess)
//            {
//                System.out.println("Your guess is smaller!\n---------------------------");
//            }
//            else if (user_guess>guess)
//            {
//                System.out.println("Your guess is greater!\n----------------------------");
//            }
//        }
//    }
//}
//HARD LEVEL:
public class number_guessing_game
{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {

        System.out.println(CYAN + "Welcome to number guessing game!🎮" + RESET);
        System.out.println("I'm thinking of a number between 0-1000.");
        System.out.println("You have one warning (*_*).");
        System.out.println("---------------------------------------");

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println(CYAN + "Select Difficulty:" + RESET);
        System.out.println("1. Easy (10 guesses)");
        System.out.println("2. Medium (7 guesses)");
        System.out.println("3. Hard (5 guesses)");

        int choice = sc.nextInt();
        int totalGuesses;

        if (choice == 1) totalGuesses = 10;
        else if (choice == 2) totalGuesses = 7;
        else totalGuesses = 5;

        boolean flag = true;
        while (flag)
        {
            int guess = rand.nextInt(1001);
            int warnings = 1;
            int min = 0, max = 1000;
            boolean won = false;

            ArrayList<Integer> guessedNumbers = new ArrayList<>();
            int attemptsUsed = 0;

            for (int i = totalGuesses; i > 0; i--)
            {
                System.out.println("\nYou have " + CYAN + i + RESET + " guesses left.");
                System.out.print("Guessed numbers: ");
                for (int num : guessedNumbers)
                {
                    System.out.print(num + " ");
                }
                System.out.println();
                System.out.print("Enter a guess: ");

                if (!sc.hasNextInt())
                {
                    sc.next();
                    if (warnings > 0)
                    {
                        warnings--;
                        System.out.println(YELLOW + "⚠ Invalid input! Warning left: " + warnings + RESET);
                    }
                    else
                    {
                        System.out.println(RED + "Invalid input! You lost a guess." + RESET);
                        i--;
                    }
                    continue;
                }
                int user_guess = sc.nextInt();

                if (user_guess < 0 || user_guess > 1000)
                {
                    System.out.println(YELLOW + "Please enter number between 0 and 1000" + RESET);
                    continue;
                }

                if (guessedNumbers.contains(user_guess))
                {
                    if (warnings > 0)
                    {
                        warnings--;
                        System.out.println(YELLOW + "⚠ Repeated guess! Warning left: " + warnings + RESET);
                    }
                    else
                    {
                        System.out.println(RED + "Repeated guess! You lost a guess." + RESET);
                        i--;
                    }
                    continue;
                }
                guessedNumbers.add(user_guess);
                attemptsUsed++;

                if (user_guess == guess)
                {
                    System.out.println(GREEN + "🎉 Congratulations! Your guess is correct." + RESET);
                    int score = ((totalGuesses - attemptsUsed + 1) * 100) / totalGuesses;
                    System.out.println(CYAN + "🎯 Your score is: " + score + RESET);
                    won = true;
                    break;
                }
                if (user_guess < guess)
                {
                    System.out.println(YELLOW + "📉 Too low! Try a bigger number." + RESET);
                    if (user_guess > min) min = user_guess;
                }
                else
                {
                    System.out.println(YELLOW + "📈 Too high! Try a smaller number." + RESET);
                    if (user_guess < max) max = user_guess;
                }
                System.out.println("Range: " + min + " - " + max);
                System.out.println("---------------------------");
            }

            if (!won)
            {
                System.out.println(RED + "\n❌ You lost! The number was: " + guess + RESET);
                System.out.println("Your total score is: 0");
            }

            System.out.println(CYAN + "\n🔁 Do you want to play again? (YES/NO)" + RESET);
            String input = sc.next();
            if (!input.equalsIgnoreCase("YES"))
            {
                flag = false;
            }
        }
        System.out.println(CYAN + "Thanks for playing! 🎮" + RESET);
    }
}