import java.util.Scanner;
public class cardgame {

    public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    
    int number = (int) (Math.random() * 100) + 1;
    
    System.out.println("Would you like to play a guessing game? (y/n)");

    String response = scan.nextLine();

    int plays = 0;
    int totalGuesses = 0;

    while (response.equals("y")){

    plays++;


    System.out.println("Choose a random number from 1 to 100");
    
    int guess = scan.nextInt();
    
    int numberOfGuesses = 0;


    while (guess != number){
      if (guess < number){

        System.out.println("Too low! Try a higher number!");
        guess = scan.nextInt();
      }
      else{
        System.out.println("Too high! Try a lower number!");
        guess = scan.nextInt();
      }

      numberOfGuesses++;


    }
    numberOfGuesses++;
    System.out.println("You got it!");
    if (numberOfGuesses >= 10){
      System.out.println("Oh dear, you took " + numberOfGuesses + " tries! Try harder next time!");
    }
    else if (numberOfGuesses >= 5){
      System.out.println("Good job! " + numberOfGuesses + " guesses is impressive!");
    }
    else{
      System.out.println("Wow, you're a mindreader!");
    }
    
    totalGuesses += numberOfGuesses;
  }

  int averageTries = totalGuesses/plays;
  System.out.println("Average number of guesses = " + averageTries);



   




  }

}
