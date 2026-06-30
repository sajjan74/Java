import java.util.Random;
import java.util.Scanner;


public class Random_num_guess {
    public static void main(String[] args){

        //Random number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt=0;
        int min = 1;
        int max = 100;
        int randomNUmber= random.nextInt(min, max+1);

        System.out.println("Number Guessing Game");
        System.out.print("Guess the number between 1 - 100");

        do{
            System.out.print("Enter Guess: " );
            guess = scanner.nextInt();
            attempt++;

            if(guess < randomNUmber){
                System.out.println("Too Low! Try again");

            }else if (guess > randomNUmber){
                System.out.println("Too high! Try again");

            }else{
                System.out.println("correct! The number was: " + randomNUmber);
                System.out.println("number of attempts " + attempt);
            }



        }while(guess != randomNUmber);

        System.out.println("You wont he game");



        scanner.close();

    }
}
