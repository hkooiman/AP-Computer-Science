

public class loopingfun
 {
    public static void main(String[] args) 
  {
    printStars(5,2);
    printTriangle(6);
    diceRoll(); 
    //jumble("glaze");
     


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
  for (int count = 1; count <= 6; ++count)
  {
    for (int counts = 1; counts <= 6; counts++)
    {
      System.out.println( "(" + count + "," + counts + ")");

    }
  }
}

public static void jumble(String str)
{
  String first = "";
  String second = "";
  String thrid = "";
  String fourth = "";

  for (int l1 = 0; l1 < str.length(); l1++)
  {
    first = (str.substring(l1, l1 +1));
    for (int l2 = 0; l2 < str.length(); l2++)
    {
      second =  str.substring(l2, l2 + 1);
      if (!(first.equals(second)))
      {
        System.out.println(first + second);
      }

    }
  }
}

 }