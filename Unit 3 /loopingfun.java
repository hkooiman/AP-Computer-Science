
import java.util.stream.Stream;

public class loopingfun
 {
    public static void main(String[] args) 
  {
    printStars(5,2);
    printTriangle(6);
    diceRoll();


  }


public static void printStars(int row, int col)
{
 
  for (int count = 1; count <= row; count++)
  {
    for (int counts = 1; counts <= col; counts++)
    {
      
      System.out.print("*");
    }
    System.out.println();
  }
}

public static void printTriangle(int rows)
{
  String tree = "";
  for (int count = 1; count <= rows; count++)
  {
    tree = tree + "*";
    System.out.println(tree);
  }
}

public static void diceRoll()
{
  for (int count = 1; count <= 6; count++)
  {
    for (int counts = 1; counts <= 6; counts++)
    {
      System.out.println( "(" + count + "," + counts + ")");

    }
  }
}

public static void jumble(String str);
{
  String first = "";
  for (int count = 0; count < str.length(); count++)
  {
    for (int count = 0; count < str.length(); count++)
    {
      
    }
  }
}

 }