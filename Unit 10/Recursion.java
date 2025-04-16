public class Recursion
{
    public static void main(String[] args)
    {
        // neverEnd();
        System.out.println(sumN(24));
        System.out.println(sumNfor(24));
        System.out.println(sumNwhile(24));


    }

    public static void neverEnd()
    {
        System.out.println("This is the method that never ends");
        neverEnd();
    }

    public static int sumN(int n)
    {
        if (n == 1) //base case
        {
            return 1;
        }
        else
        {
            return n + sumN(n-1); //recursive call
        }

    }

    public static int sumNfor(int n)
    {
        int sum = 0;
        for (int i = n; i > 0; i--)
        {
            sum += i;
        }

        return sum;
    }

    public static int sumNwhile(int n)
    {
        int sum = 0;
        int num = n;
        while (num > 0)
        {
            sum += num;
            num--;
        }

        return sum;
    }
}