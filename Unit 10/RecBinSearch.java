import java.util.ArrayList;
public class RecBinSearch 
{
  public static void main(String[] args)  
  {
      
      int[] arr = {2,5,12,14, 15,17,23,45,56,67,69,82,83,99};
      int foundIndex = recursiveBinarySearch(arr, 99, 0, arr.length-1); //search for #99 in the array
      System.out.println("Index of target is: " + foundIndex);
      String[] arrs = {"alphabet", "banana", "cats", "dog", "elephant", "frog", "giraffe", "hippo"};
      int foundmyIndex = recursiveBinarySearch(arrs, "elephant", 0, arrs.length-1);
      System.out.println("Index of elephant is: " + foundmyIndex);
      ArrayList<String> arraylist = new ArrayList<String>();
      arraylist.add("alphabet");
      arraylist.add("banana");
      arraylist.add("cats");
      int foundmyi = recursiveBinarySearch(arraylist, "banana", 0, arraylist.size());
      System.out.println("Index of banana is: " + foundmyi);

  
    }

  public static int recursiveBinarySearch (int[] myArray, int target, int startVal, int endVal)
  {
    int middle = (startVal + endVal)/2; //define middle

    //base cases
    if (myArray[middle] == target) //target found
    {
      return middle;
    }
    else if (endVal < startVal)
    {
      return -1;
    }
    //recursive calls
    else if (target < myArray[middle])
    {
      return recursiveBinarySearch(myArray, target, startVal, middle -1);
    }
    else 
    {
      return recursiveBinarySearch(myArray, target, middle +1, endVal);
    }
  
  
  
  }

  public static int recursiveBinarySearch (String[] myArray, String target, int startVal, int endVal)
  {
    int middle = (startVal + endVal)/2; //define middle

    //base cases
    if (myArray[middle].equals(target)) //target found
    {
      return middle;
    }
    else if (endVal < startVal)
    {
      return -1;
    }
    //recursive calls
    else if (target.compareTo(myArray[middle]) < 0)
    {
      return recursiveBinarySearch(myArray, target, startVal, middle -1);
    }
    else 
    {
      return recursiveBinarySearch(myArray, target, middle +1, endVal);
    }
  
  
  
  }

   public static int recursiveBinarySearch (ArrayList<String> myArray, String target, int startVal, int endVal)
  {
    int middle = (startVal + endVal)/2; //define middle

    //base cases
    if (myArray.get(middle).equals(target)) //target found
    {
      return middle;
    }
    else if (endVal < startVal)
    {
      return -1;
    }
    //recursive calls
    else if (target.compareTo(myArray.get(middle)) < 0)
    {
      return recursiveBinarySearch(myArray, target, startVal, middle -1);
    }
    else 
    {
      return recursiveBinarySearch(myArray, target, middle +1, endVal);
    }
  
  
  
  }
}