abstract class shape
{
    abstract void draw();
}

class rect extends shape
{
    void draw()
    {
        System.out.println("Drawing Rectangle....");
    }
}

class circle extends shape
{
    void draw()
    {
        System.out.println("Drawing circle....");
    }
}


public class pract4 {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
        
    }    
}
