
import java.awt.image.IndexColorModel;
import java.util.Scanner;


public class magpie

{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String question = scan.next();
    if (question.indexOf("no") >= 0)
      System.out.println(getResponse(question));

  }

  public String getResponse(String statement)
  {
      
      if (statement.indexOf("no") >= 0)
      {
           System.out.println("Why so negative?");
      } else if (statement.indexOf("mother") >= 0
              || statement.indexOf("father") >= 0
              || statement.indexOf("sister") >= 0
              || statement.indexOf("brother") >= 0)
      {
          System.out.println("Tell me more about your family.");
      }
      else
      {
          System.out.println(getRandomResponse());
      }
      return "no way";
  }

  private String getRandomResponse()
  {
      final int NUMBER_OF_RESPONSES = 4;
      double r = Math.random();
      int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
      String response = "";

      if (whichResponse == 0)
      {
          response = "Interesting, tell me more.";
      }
      else if (whichResponse == 1)
      {
          response = "Hmmm.";
      }
      else if (whichResponse == 2)
      {
          response = "Do you really think so?";
      }
      else if (whichResponse == 3)
      {
          response = "You don't say.";
      }
      return response;
  }


}