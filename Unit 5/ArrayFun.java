import java.util.Scanner;

public class ArrayFun {
    
    public static void main (String[] args)
    {
        //declare and initialize an integer array - for example this one can only hold 3 integers in it's list (with default values of '0')
        int[] intArray = new int[3];
        System.out.println(intArray[2]); //number refers to the INDEX (ex. [3] refers to index 3)

        intArray[0] = (int) (Math.random() * 7 + 1);
        intArray[1] = (int) (Math.random() * 7 + 1);
        intArray[2] = (int) (Math.random() * 7 + 1);

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        //creat a list with the first 50 positive even integers  (0-100) using a for loop

        int[] a2 = new int[50];
        for (int i = 0; i <= 49; i++)
        {
            a2[i] = (i + 1) * 2;

        }

       //list with the names of the people on your side of the classroom

       String[] names = new String[4];
       System.out.println(names[0]);
       boolean[] test = new boolean[1];
       System.out.println(test[0]);

       names[0] = "Hannah";
       names[1] = "Samuel";
       names[2] = "Isaiah";
       names[3] = "Catherine";

       //OR

       //String [] name = {"Hannah", "Samuel", "Isaiah", "Catherine"}; BUT CAN only be used during the initialization step

       System.out.println(names[0]);

       //Write a method to pick a random studetn from the list

       System.out.println(randomStudent(names));

       //Write a while loop to allow multiple random picks (with scanner)
       boolean stop = false;
       Scanner scan = new Scanner(System.in);

       while (!stop)
       {
        System.out.println(randomStudent(names));
        System.out.println("Pick another name? (y/n)");
        String choice = scan.nextLine();
        if (!"y".equals(choice))
        stop = true;

       }
       scan.close();

       System.out.println(names[0].length());
       System.out.println(names.length);
       System.out.println(names[names.length - 1]); //to find the last element on an array

       Fraction[] fracList = {new Fraction(3,4), new Fraction(5,12)};
       System.out.println(fracList[1]);



}
       public static String randomStudent(String[] str)
       {

        int i = (int) (Math.random() * 4);

        return str[i];

       }


       



    
}
