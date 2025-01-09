
import javax.swing.plaf.metal.MetalIconFactory;

public class Fraction {
    private int numerator;
    private int denomenator;

    public Fraction(int numerator, int denomenator)
    {
        this.numerator = numerator;
        this.denomenator = denomenator;
    }

    public String toString()
    {
        return "My fraction: " + numerator + "/" + denomenator;
         
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenomenator()
    {
        return denomenator;
    }

    public static Fraction multiply(Fraction x, Fraction y)
    {
       return new Fraction(x.getNumerator()*y.getNumerator(), x.getDenomenator()*y.getDenomenator());
    }

    public Fraction multiply(Fraction x)
    {
        return multiply(this, x);
    }

}

class TestersClass
{
    public static void main(String[] args)
    { /* 
        Fraction f1 = new Fraction(2,3);
        System.out.println(f1);
        Fraction f2 = new Fraction(33,29);
        System.out.println(f2);
        System.out.println(f2.getDenomenator());
        System.out.println(Fraction.multiply(f1,f2));
        System.out.println(f1.multiply(f2)); */




    }
}
