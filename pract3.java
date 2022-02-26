interface area
{
    double pi = 3.14;
    double calc(double a , double b) ;
    double e = 1/2;
}
class rectangle implements area
{
    public double calc(double a , double b)
    {
        return(a * b);
    }
}
class circle implements area
{
    public double calc(double a , double b )
    {
        return(pi * a * a);
    }
}

class trangle implements area
{
    public double calc(double a , double b)
    {
        return(  0.5 * a * b);
    }
}
public class pract3 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();
        trangle t = new trangle();
        area rr ;

        rr = r ;
        System.out.println("Area of rectangle is "+ rr.calc(50 ,30));
        rr = c ;
        System.out.println("Area of circle is : " + rr.calc(10, 10));

        rr = t ;
        System.out.println("Area of trangle is : " +rr.calc(8, 2));
    }
    
}
