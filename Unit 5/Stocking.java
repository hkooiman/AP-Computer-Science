public class Stocking {
    //these instance varioables are stored in dynamically allocated memory. They BELONG to an instance of the class
    private String owner; //whose stocking is it?
    private int itemCount; //number of presents in a stocking
    private int idNum; //id number of a stocking
    private static int stockingCount = 0; //static variables belong to the class! 

    //Zero parameter constructor
    public Stocking()
    {
        owner = "";
        itemCount = 0;
        stockingCount++;
        idNum = stockingCount;
    }

    public Stocking(String name, int initItems)
    {
        owner = name;
        itemCount = initItems;
        idNum = ++stockingCount;
    }

    public int getItemCount()
    {
        return itemCount;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getId()
    {
        return idNum;
    }

    public void setItemCount(int ic)
    {
        itemCount = ic;
    }

    public void setOwner(String o)
    {
        owner = o;
    }

    public String toString()
    {
        return "It's " + owner + "'s stocking, with " + itemCount + " presents, and ID number " + idNum + ".";
    }

    //static methods can ONLY access static variables, but nonstatic methods can access either/both
    public static int getStockingCount()
    {
        return stockingCount;
    }


}

class TestClass
{
    public static void main(String[] args)
    {
        Stocking s1 = new Stocking();
        Stocking s2 = new Stocking("Hannah", 9);
        Stocking s3 = new Stocking("Samuel", 12);
        System.out.println(s1.getItemCount());
        System.out.println(s1.getId());
        System.out.println(Stocking.getStockingCount());
        System.out.println(s2);


    }
}