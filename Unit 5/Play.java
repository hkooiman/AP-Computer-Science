import java.util.Scanner;

public class Play {

     private String answer;
     private String clue;
     private String help;

    public Play (Celebrity c)
    {
        
    }

    
    
    public static void main(String[] args)
  {
    Celebrity game1 = new Celebrity("Anne Hathaway", "Princess Diaries", "The Devil Wears Prada");
    Play g1 = new Play(game1);
      System.out.println("Hello, would you like a clue for the celebrity name? (y/n)  ");
      Scanner scan = new Scanner(System.in);
      String command = scan.next();
      if (command.equals("y"))
      {
        System.out.println("Clue 1: " + game1.getClue());
      }
      else
      {
        System.out.println("Okay, see you later"); 
      }
        System.out.println("First guess: ");
    
      Scanner scan1 = new Scanner(System.in);
       String command1 = scan.next();
       while (!(command1.equals(game1.getAnswer())))
       {
           System.out.println("Sorry, guess again: ");
            command1 = scan.next();
             
       }

       System.out.print("Congrats, you guessed it! Celebrity: " + game1.getAnswer());
       
     

  } 
}
