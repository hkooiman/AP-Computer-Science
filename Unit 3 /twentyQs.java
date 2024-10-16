import java.util.Scanner;

public class twentyQs 
{
  public static void main(String[] args) 
  {
    System.out.println("\n\nLet's play 20 questions. Choose an animal (make it a wolf) and I will try to guess it!");
    Scanner scan = new Scanner(System.in);

    System.out.println("Is it a mammal (y/n)?");
    String answer = scan.nextLine();
    if (answer.equals("y")) 
    {
   
     System.out.println("Does it live on land?");
      answer = scan.nextLine();
      if (answer.equals("y"))
      {
        System.out.println("Is it wild?");
        answer = scan.nextLine();
        if (answer.equals("y"))
        {
          System.out.println("Is it a predator?");
          answer = scan.nextLine();
          if (answer.equals("y"))
          {
            System.out.println("Does it live in a desert?");
            answer = scan.nextLine();
            if (answer.equals("n"))
            {
              System.out.println("Does it live in a forest?");
              answer = scan.nextLine();
              if (answer.equals("y"))
                {
                  System.out.println("Does it travel in a pack?");
                  answer = scan.nextLine();
                    if (answer.equals("y"))
                  {
                    System.out.println("I guess: a wolf!");
                  }
        
              
              else
              System.out.println("Choose a new animal!");
            }
            else
            System.out.println("Choose a new animal!");
          }
          else
          System.out.println("Choose a new animal!");
        }
        else
        System.out.println("Choose a new animal!");
      }
      else
      System.out.println("Choose a new animal!");
    }
    else
      System.out.println("Choose a new animal!");
    }
  }
}
