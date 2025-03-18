//example on inheretance
public class Polygon
{
    private String shapeName;
    private int numSides;

    public Polygon()
    {
        numSides = 0;
        shapeName = "polygon";
        System.out.println("Polygon 0-param constructor called");
    }

    public Polygon(int x, String n)
    {
        numSides = x;
        shapeName = n;

    }

    public String getName()
    {
        return shapeName;
    }

    public int getSides()
    {
        return numSides;
    }

    public String toString()
    {
        return "Shape: " + shapeName + " Sides: " + numSides;
    }

    public static void main(String[] args)
    {
         Polygon p1 = new Polygon(5, "Pentagon");
         Triangle t1 = new Triangle(3,4,5);
         EquilateralTriangle t2 = new EquilateralTriangle(2);
         Square s1 = new Square();
         System.out.println(p1.getName() + "-" + p1.getSides());
         System.out.println(t2.getName() + "-" + t2.getSides());
         System.out.println(t1);
         System.out.println(s1);
    }
}

class Triangle extends Polygon
{
    private int[] sides = new int[3];

    public Triangle()
    {
        super(3, "Triangle");
    }

    public Triangle(int s1, int s2, int s3)
    {
        this();
        sides[0] = s1;
        sides[1] = s2;
        sides[2] = s3;
    }

    public String toString()
    {
        return super.toString() + "\nSidelengths are: " + sides[0] + ", " + sides[1] + ", " + sides[2];
    }

}

class EquilateralTriangle extends Triangle
{
    public EquilateralTriangle(int s)
    {
        super(s,s,s);
    }

}

class Square extends Polygon
{
    public Square()
    {
        super(4, "Square");
    }
}