import java.util.Scanner;

public class map
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("\n\n You've entered parcel tinerectilui.\n There is a leading into the park, and a street leading crossways. \n Which way do you want to go (n,e,s,w)?");
      String command = scan.next(); // use nextLine() in your own IDE
      if (command.equals("n"))
      {
          System.out.println("You enter the main pathway of the park. Ahead of you is a fountian, to your left: a playground, to your right: statues.");
          String c = scan.next();

          if (c.equals("n"))
            System.out.println("You walk towards the fountain and feel the fresh mist against your skin.");

          else if (c.equals("e"))
            System.out.println("You walk to the center of a cirle of statues. On each statue there is a bust and a description.");

          else if (c.equals("s"))
            System.out.println("You walk back to the entrance of the park and look out onto a block of apartment buildings. Your journey ends here.");
          
          else if (c.equals("w"))
            System.out.println("You walk to a small playground. There is a set of swings, a slide, and a bench");
      }
      else if (command.equals("s"))
      {
          System.out.println("You walk home, your journey ends here.");
      }
      else if (command.equals("e"))
      {
          System.out.println("You walk down a path bordering a circle of staues to your left.");

          String o = scan.next();
          if (o.equals("n"))
            System.out.println("You continue down the path and reach a gate. You cannot pass through the gate. Your journey ends here.");
          else if (o.equals("e"))
            System.out.println("You walk onto a patch of grass. There is a family having a picnic. You smile and wave");
          else if (o.equals("s"))
            System.out.println("You walk back to the entrance of the park.");
          else if (o.equals("w"))
      }
      else if (command.equals("w"))
          System.out.println("You walk down a path bordering a small playground to your right.");
      // Add else-ifs for s, e, w, and an else for any other input. Be creative!


      //System.out.println("End of adventure!");
      scan.close();
   }
}